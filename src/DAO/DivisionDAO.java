/***********************************************************************
 * Module:  DivisionDAO.java
 * Author:  Moustaid
 * Purpose: Defines the Class DivisionDAO
 ***********************************************************************/

package DAO;

import JavaBeans.Division;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/** @pdOid e8a3ba24-fca6-4e22-a343-7376b283f358 */
public class DivisionDAO extends GeneriqueDAO<Division,Integer> {
   /** @param cnx
    * @pdOid ba88cdd7-9ae3-4ea2-91d0-f24facaad5e5 */
   public DivisionDAO(Connection cnx) {
      super(cnx);
   }

    @Override
    public List<Division> readAll() {
List<Division> ld=new ArrayList();

               try{
        PreparedStatement ps=cnx.prepareStatement("select * from division");
       ResultSet rs=ps.executeQuery();
       while(rs.next())
       {
           Division d=new Division();
       d.setIdDivision(rs.getInt("iddivision"));
       d.setNomDivision(rs.getString("nomdivision")); 
       ld.add(d); 
       }
        ps.close();
        }
        catch(SQLException e){e.printStackTrace();}
        return ld;      }

    @Override
    public void delete(Integer id) {
  try{
  PreparedStatement ps=cnx.prepareStatement
        ("delete from division where iddivision like ?");
        ps.setInt(1, id);
        ps.executeUpdate();
        ps.close();
        }
        catch(SQLException e){e.printStackTrace();}      }

    @Override
    public void update(Division obj) {
  try{
        PreparedStatement ps=cnx.prepareStatement
        ("update division set nomdivision=? where iddivision like ?");
        ps.setString(1, obj.getNomDivision());
        ps.setInt(2, obj.getIdDivision());
       
        ps.executeUpdate();
        ps.close();
        }
        catch(SQLException e){e.printStackTrace();}    }

    @Override
    public Division read(Integer id) {
Division d=new Division();
               try{
        PreparedStatement ps=cnx.prepareStatement("select * from division where iddivision=?");
        ps.setInt(1, id);
       ResultSet rs=ps.executeQuery();
       while(rs.next())
       {
       d.setIdDivision(id);
       d.setNomDivision(rs.getString("nomdivision"));
       }
        ps.close();
        }
        catch(SQLException e){e.printStackTrace();}
        return d;      }

    @Override
    public void create(Division obj) {
try{
        PreparedStatement ps=cnx.prepareStatement("insert into division values(?,?)");
        ps.setInt(1, obj.getIdDivision());
        ps.setString(2, obj.getNomDivision());
        ps.executeUpdate();
        ps.close();
        }
        catch(SQLException e){
        e.printStackTrace();}    }

    @Override
    public int getMaxId() {
 int max=0;  
         try{
        PreparedStatement ps=cnx.prepareStatement("select max(iddivision) from division");             
       ResultSet rs=ps.executeQuery();
       rs.next();
       max=rs.getInt(1);     
        ps.close();
    }
         catch(SQLException e){e.printStackTrace();}
        return max ;     
    }
    
        public List<Division> findByPartOf(String text) {
List<Division> ld=new ArrayList();
               try{
                   PreparedStatement ps=null;
        ps=cnx.prepareStatement
        ("select * from division where nomdivision like '"+text+"%'");

        ResultSet rs=ps.executeQuery();
       while(rs.next())
       {
           Division d=new Division();
         d.setIdDivision(rs.getInt("iddivision"));
       d.setNomDivision(rs.getString("nomdivision"));
       ld.add(d);
       }
        ps.close();
        }
        catch(SQLException e){e.printStackTrace();}
        return ld;    }

}