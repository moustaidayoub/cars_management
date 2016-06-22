/***********************************************************************
 * Module:  UtilisateurDAO.java
 * Author:  Moustaid
 * Purpose: Defines the Class UtilisateurDAO
 ***********************************************************************/

package DAO;

import JavaBeans.Utilisateur;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/** @pdOid 2b6da893-2602-4d48-bd92-4b4d65f6c55f */
public class UtilisateurDAO extends GeneriqueDAO<Utilisateur,String> {
   /** @param cnx
    * @pdOid aa3e4749-9117-4a29-a7f3-c40326f9343c */
   public UtilisateurDAO(Connection cnx) {
      super(cnx);
   }

   @Override
    public void update(Utilisateur obj) {
try{
        PreparedStatement ps=cnx.prepareStatement
        ("update utilisateur set matriculeuser=?,nomuser=?,prenomuser=?,password=?,shema=? ");
        ps.setString(1, obj.getMatriculeUser());
        ps.setString(2, obj.getNomUser());
        ps.setString(3, obj.getPrenomUser());
        ps.setString(4, obj.getPassword());
        ps.setString(5, obj.getShema());


        ps.executeUpdate();
        ps.close();
        }
        catch(SQLException e){e.printStackTrace();}     }

    @Override
    public Utilisateur read(String id) {
Utilisateur u=new Utilisateur();
               try{
        PreparedStatement ps=cnx.prepareStatement("select * from utilisateur where matriculeuser=?");
        ps.setString(1, id);
       ResultSet rs=ps.executeQuery();
       while(rs.next())
       {
       u.setMatriculeUser(id);
       u.setNomUser(rs.getString("nomuser"));
       u.setPrenomUser(rs.getString("prenomuser"));
       u.setPassword(rs.getString("password"));
       u.setShema(rs.getString("shema"));
       }
        ps.close();
        }
        catch(SQLException e){e.printStackTrace();}
        return u;     }
    
public Utilisateur read() {
Utilisateur u=new Utilisateur();
               try{
        PreparedStatement ps=cnx.prepareStatement("select * from utilisateur");
       ResultSet rs=ps.executeQuery();
       while(rs.next())
       {
       u.setMatriculeUser(rs.getString("matriculeuser"));
       u.setNomUser(rs.getString("nomuser"));
       u.setPrenomUser(rs.getString("prenomuser"));
       u.setPassword(rs.getString("password"));
       u.setShema(rs.getString("shema"));
       }
        ps.close();
        }
        catch(SQLException e){e.printStackTrace();}
        return u;     }

    @Override
    public void create(Utilisateur obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Utilisateur> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getMaxId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}