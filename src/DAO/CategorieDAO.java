/***********************************************************************
 * Module:  CategorieDAO.java
 * Author:  Moustaid
 * Purpose: Defines the Class CategorieDAO
 ***********************************************************************/

package DAO;

import JavaBeans.Categorie;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/** @pdOid 2ae5bbaa-c17c-4bb5-8fa9-a583aeffaa5e */
public class CategorieDAO extends GeneriqueDAO<Categorie,Integer> {
   /** @param cnx
    * @pdOid 35c2be12-0439-4716-b8c8-a877443aedb9 */
   public CategorieDAO(Connection cnx) {
     super(cnx); 
   }

    @Override
    public List<Categorie> readAll() {
List<Categorie> lc=new ArrayList();

               try{
        PreparedStatement ps=cnx.prepareStatement("select * from categorie");
       ResultSet rs=ps.executeQuery();
       while(rs.next())
       {
           Categorie c=new Categorie();
       c.setIdCategorie(rs.getInt("idcategorie"));
       c.setNomCategorie(rs.getString("nomcategorie")); 
       lc.add(c); 
       }
        ps.close();
        }
        catch(SQLException e){e.printStackTrace();}
        return lc;      }

    @Override
    public void delete(Integer id) {
        try{
  PreparedStatement ps=cnx.prepareStatement
        ("delete from categorie where idcategorie like ?");
        ps.setInt(1, id);
        ps.executeUpdate();
        ps.close();
        }
        catch(SQLException e){e.printStackTrace();}     }

    @Override
    public void update(Categorie obj) {
  try{
        PreparedStatement ps=cnx.prepareStatement
        ("update categorie set nomcategorie=? where idcategorie like ?");
        ps.setString(1, obj.getNomCategorie());
        ps.setInt(2, obj.getIdCategorie());
       
        ps.executeUpdate();
        ps.close();
        }
        catch(SQLException e){e.printStackTrace();}
    }

    @Override
    public Categorie read(Integer id) {
Categorie c=new Categorie();
               try{
        PreparedStatement ps=cnx.prepareStatement("select * from categorie where idcategorie=?");
        ps.setInt(1, id);
       ResultSet rs=ps.executeQuery();
       while(rs.next())
       {
       c.setIdCategorie(id);
       c.setNomCategorie(rs.getString("nomcategorie"));
       }
        ps.close();
        }
        catch(SQLException e){e.printStackTrace();}
        return c;      }

    @Override
    public void create(Categorie obj) {
        try{
        PreparedStatement ps=cnx.prepareStatement("insert into categorie values(?,?)");
        ps.setInt(1, obj.getIdCategorie());
        ps.setString(2, obj.getNomCategorie());
        ps.executeUpdate();
        ps.close();
        }
        catch(SQLException e){
        e.printStackTrace();}
            }

    @Override
    public int getMaxId() {
 int max=0;  
         try{
        PreparedStatement ps=cnx.prepareStatement("select max(idcategorie) from categorie");
                       
       ResultSet rs=ps.executeQuery();
       rs.next();
       max=rs.getInt(1);     
        ps.close();
    }
         catch(SQLException e){e.printStackTrace();}
        return max ;  }
     public List<Categorie> findByPartOf(String text) {
List<Categorie> lc=new ArrayList();
               try{
                   PreparedStatement ps=null;
              
        ps=cnx.prepareStatement
        ("select * from categorie where nomcategorie like '"+text+"%'");

        ResultSet rs=ps.executeQuery();
       while(rs.next())
       {
           Categorie c=new Categorie();
         c.setIdCategorie(rs.getInt("idcategorie"));
       c.setNomCategorie(rs.getString("nomcategorie"));
       lc.add(c);
       }
        ps.close();
        }
        catch(SQLException e){e.printStackTrace();}
        return lc;    }
   

}