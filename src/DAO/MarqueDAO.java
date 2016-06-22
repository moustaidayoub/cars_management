/***********************************************************************
 * Module:  MarqueDAO.java
 * Author:  Moustaid
 * Purpose: Defines the Class MarqueDAO
 ***********************************************************************/

package DAO;

import JavaBeans.Marque;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/** @pdOid b7b22f7a-88fd-4add-88d9-5171ce72fe65 */
public class MarqueDAO extends GeneriqueDAO<Marque,Integer> {
   /** @param cnx
    * @pdOid 8209ef73-89e6-41d9-ac6d-a52496b1e95b */
   public MarqueDAO(Connection cnx) {
    super(cnx);
   }

    @Override
    public List<Marque> readAll() {
List<Marque> lm=new ArrayList();

               try{
        PreparedStatement ps=cnx.prepareStatement("select * from marque");
       ResultSet rs=ps.executeQuery();
       while(rs.next())
       {
           Marque m=new Marque();
       m.setIdMarque(rs.getInt("idmarque"));
       m.setNomMarque(rs.getString("nommarque")); 
       lm.add(m); 
       }
        ps.close();
        }
        catch(SQLException e){e.printStackTrace();}
        return lm;      }

    @Override
    public void delete(Integer id) {
  try{
  PreparedStatement ps=cnx.prepareStatement
        ("delete from marque where idmarque like ?");
        ps.setInt(1, id);
        ps.executeUpdate();
        ps.close();
        }
        catch(SQLException e){e.printStackTrace();}      }

    @Override
    public void update(Marque obj) {
  try{
        PreparedStatement ps=cnx.prepareStatement
        ("update Marque set nommarque=? where idmarque like ?");
        ps.setString(1, obj.getNomMarque());
        ps.setInt(2, obj.getIdMarque());
       
        ps.executeUpdate();
        ps.close();
        }
        catch(SQLException e){e.printStackTrace();}    }

    @Override
    public Marque read(Integer id) {
Marque m=new Marque();
               try{
        PreparedStatement ps=cnx.prepareStatement("select * from marque where idmarque=?");
        ps.setInt(1, id);
       ResultSet rs=ps.executeQuery();
       while(rs.next())
       {
       m.setIdMarque(id);
       m.setNomMarque(rs.getString("nommarque"));
       }
        ps.close();
        }
        catch(SQLException e){e.printStackTrace();}
        return m;       }

    @Override
    public void create(Marque obj) {
      try{
 PreparedStatement ps=cnx.prepareStatement("insert into marque values(?,?)");
        ps.setInt(1, obj.getIdMarque());
        ps.setString(2, obj.getNomMarque());
        ps.executeUpdate();
        ps.close();
        }
        catch(SQLException e){
        e.printStackTrace();}       }

    @Override
    public int getMaxId() {
 int max=0;  
         try{
        PreparedStatement ps=cnx.prepareStatement("select max(idmarque) from marque");
                       
       ResultSet rs=ps.executeQuery();
       rs.next();
       max=rs.getInt(1);     
        ps.close();
    }
         catch(SQLException e){e.printStackTrace();}
        return max ;  
    }
    
    public List<Marque> findByPartOf(String text) {
List<Marque> lm=new ArrayList();
               try{
                   PreparedStatement ps=null;
        ps=cnx.prepareStatement
        ("select * from marque where nommarque like '"+text+"%'");

        ResultSet rs=ps.executeQuery();
       while(rs.next())
       {
           Marque m=new Marque();
         m.setIdMarque(rs.getInt("idmarque"));
       m.setNomMarque(rs.getString("nommarque"));
       lm.add(m);
       }
        ps.close();
        }
        catch(SQLException e){e.printStackTrace();}
        return lm;    }
   

}