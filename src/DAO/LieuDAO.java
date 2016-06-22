/***********************************************************************
 * Module:  LieuDAO.java
 * Author:  Moustaid
 * Purpose: Defines the Class LieuDAO
 ***********************************************************************/

package DAO;


import JavaBeans.Lieu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/** @pdOid ea361623-2561-4221-bf75-fb352bee1158 */
public class LieuDAO extends GeneriqueDAO<Lieu,Integer> {
   /** @param cnx
    * @pdOid dbd13369-9b06-4869-bf02-18b997fde05f */
   public LieuDAO(Connection cnx) {
    super(cnx);
   }

    @Override
    public List<Lieu> readAll() {
List<Lieu> ll=new ArrayList();

               try{
        PreparedStatement ps=cnx.prepareStatement("select * from lieu");
       ResultSet rs=ps.executeQuery();
       while(rs.next())
       {
           Lieu l=new Lieu();
      l.setIdLieu(rs.getInt("idlieu"));
       DivisionDAO dDao=new DivisionDAO(SingletonConnexion.getInstance());
       l.setDivision(dDao.read(rs.getInt("iddivision")));
       l.setNomLieu(rs.getString("nomlieu"));
       l.setVille(rs.getString("ville"));
       ll.add(l);
       }
        ps.close();
        }
        catch(SQLException e){e.printStackTrace();}
        return ll;  
    }

    @Override
    public void delete(Integer id) {
  try{
  PreparedStatement ps=cnx.prepareStatement
        ("delete from lieu where idlieu like ?");
        ps.setInt(1, id);
        ps.executeUpdate();
        ps.close();
        }
        catch(SQLException e){e.printStackTrace();}      }

    @Override
    public void update(Lieu obj) {
  try{
        PreparedStatement ps=cnx.prepareStatement
        ("update lieu set iddivision=?,nomlieu=?,ville=? where idlieu like ?");
        ps.setInt(1, obj.getDivision().getIdDivision());
        ps.setString(2, obj.getNomLieu());
        ps.setString(3, obj.getVille());
        ps.setInt(4, obj.getIdLieu());
        ps.executeUpdate();
        ps.close();
        }
        catch(SQLException e){e.printStackTrace();}    }

    @Override
    public Lieu read(Integer id) {
Lieu l=new Lieu();
               try{
        PreparedStatement ps=cnx.prepareStatement("select * from lieu where idlieu=?");
        ps.setInt(1, id);
       ResultSet rs=ps.executeQuery();
       while(rs.next())
       {
       l.setIdLieu(id);
       DivisionDAO dDao=new DivisionDAO(SingletonConnexion.getInstance());
       l.setDivision(dDao.read(rs.getInt("iddivision")));
       l.setNomLieu(rs.getString("nomlieu"));
       l.setVille(rs.getString("ville"));
       }
        ps.close();
        }
        catch(SQLException e){e.printStackTrace();}
        return l;      }

    @Override
    public void create(Lieu obj) {
        try{
 PreparedStatement ps=cnx.prepareStatement("insert into lieu values(?,?,?,?)");
        ps.setInt(1, obj.getIdLieu());
        ps.setInt(2, obj.getDivision().getIdDivision());
        ps.setString(3, obj.getNomLieu());
        ps.setString(4, obj.getVille());
        ps.executeUpdate();
        ps.close();
        }
        catch(SQLException e){
        e.printStackTrace();}     }

    @Override
    public int getMaxId() {
 int max=0;  
         try{
        PreparedStatement ps=cnx.prepareStatement("select max(idlieu) from lieu");
                       
       ResultSet rs=ps.executeQuery();
       rs.next();
       max=rs.getInt(1);     
        ps.close();
    }
         catch(SQLException e){e.printStackTrace();}
        return max ;  
    }
    
       public List<Lieu> findByPartOf(String text,String choice) {
List<Lieu> ll=new ArrayList();
       DivisionDAO dDao=new DivisionDAO(SingletonConnexion.getInstance());
               try{
                   PreparedStatement ps=null;
                      if(choice.equals("NOMDivision"))
               { 
                   choice="IDDIVISION";
        ps=cnx.prepareStatement("select * from lieu,division where lieu."+choice+"=division."+choice+" and nomdivision like '"+text+"%'");
               }
                else 
        ps=cnx.prepareStatement
        ("select * from lieu where "+choice+" like '"+text+"%'");

        ResultSet rs=ps.executeQuery();
       while(rs.next())
       {
           Lieu l=new Lieu();
         l.setIdLieu(rs.getInt("idlieu"));
       l.setNomLieu(rs.getString("nomlieu"));
        l.setVille(rs.getString("ville"));
       l.setDivision(dDao.read(rs.getInt("iddivision")));


       ll.add(l);
       }
        ps.close();
        }
        catch(SQLException e){e.printStackTrace();}
        return ll;    }
   

}