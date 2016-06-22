/***********************************************************************
 * Module:  VehiculeDAO.java
 * Author:  Moustaid
 * Purpose: Defines the Class VehiculeDAO
 ***********************************************************************/

package DAO;

import JavaBeans.Vehicule;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/** @pdOid 7b89c381-367e-4e63-a3ea-a9c6eafe8781 */
public class VehiculeDAO extends GeneriqueDAO<Vehicule,String> {
   /** @param cnx
    * @pdOid a515aa49-2455-4f53-b9e4-7f94dd0b4dbf */
   public VehiculeDAO(Connection cnx) {
      super(cnx);
   }

    @Override
    public List<Vehicule> readAll() {
List<Vehicule> lv=new ArrayList();

               try{
        PreparedStatement ps=cnx.prepareStatement("select * from vehicule");
       ResultSet rs=ps.executeQuery();
       while(rs.next())
       {
           Vehicule v=new Vehicule();
         v.setMatricule(rs.getString("matricule"));
       LieuDAO lDAO=new LieuDAO(SingletonConnexion.getInstance());
       v.setLieu(lDAO.read(rs.getInt("idlieu")));
       CategorieDAO cDAO=new CategorieDAO(SingletonConnexion.getInstance());
       v.setCategorie(cDAO.read(rs.getInt("idcategorie")));
       MarqueDAO mDAO=new MarqueDAO(SingletonConnexion.getInstance());
       v.setMarque(mDAO.read(rs.getInt("idmarque")));
       v.setKilometrage(rs.getInt("kilometrage"));
       v.setCouleur(rs.getString("couleur"));
       v.setDateAjout(String.valueOf(rs.getDate("dateajout")));
       lv.add(v);
       }
        ps.close();
        }
        catch(SQLException e){e.printStackTrace();}
        return lv;     }

    @Override
    public void delete(String id) {
  try{
  PreparedStatement ps=cnx.prepareStatement
        ("delete from vehicule where matricule like ?");
        ps.setString(1, id);
        ps.executeUpdate();
        ps.close();
        }
        catch(SQLException e){e.printStackTrace();}      }

    public void update(Vehicule obj,String oldMatricule) {
try{
        PreparedStatement ps=cnx.prepareStatement
        ("update vehicule set matricule=?,idlieu=?,idcategorie=?,idmarque=?,kilometrage=?,couleur=?,dateajout='"+obj.getDateAjout()+"' where matricule like ?");
        ps.setString(1, obj.getMatricule());
        ps.setInt(2, obj.getLieu().getIdLieu());
        ps.setInt(3, obj.getCategorie().getIdCategorie());
        ps.setInt(4, obj.getMarque().getIdMarque());
        ps.setInt(5, obj.getKilometrage());
        ps.setString(6, obj.getCouleur());
        ps.setString(7, oldMatricule);
        ps.executeUpdate();
        ps.close();
        }
        catch(SQLException e){e.printStackTrace();}     }

    @Override
    public Vehicule read(String id) {
    Vehicule v=new Vehicule();
               try{
        PreparedStatement ps=cnx.prepareStatement("select * from vehicule where matricule=?");
        ps.setString(1, id);
       ResultSet rs=ps.executeQuery();
       while(rs.next())
       {
       v.setMatricule(id);
       LieuDAO lDAO=new LieuDAO(SingletonConnexion.getInstance());
       v.setLieu(lDAO.read(rs.getInt("idlieu")));
       CategorieDAO cDAO=new CategorieDAO(SingletonConnexion.getInstance());
       v.setCategorie(cDAO.read(rs.getInt("idcategorie")));
       MarqueDAO mDAO=new MarqueDAO(SingletonConnexion.getInstance());
       v.setMarque(mDAO.read(rs.getInt("idmarque")));
       v.setKilometrage(rs.getInt("kilometrage"));
       v.setCouleur(rs.getString("couleur"));
       v.setDateAjout(String.valueOf(rs.getDate("dateajout")));
       }
        ps.close();
               }
        catch(SQLException e){e.printStackTrace();}
        return v; }

    @Override
    public void create(Vehicule obj) {
try{
 PreparedStatement ps=cnx.prepareStatement("insert into vehicule values(?,?,?,?,?,?,'"+obj.getDateAjout()+"')");
        ps.setString(1, obj.getMatricule());
        ps.setInt(2, obj.getLieu().getIdLieu());
        ps.setInt(3, obj.getCategorie().getIdCategorie());
        ps.setInt(4, obj.getMarque().getIdMarque());
        ps.setInt(5, obj.getKilometrage());
        ps.setString(6, obj.getCouleur());
        ps.executeUpdate();
        ps.close();
        }
        catch(SQLException e){
        e.printStackTrace();}      }

    @Override
    public int getMaxId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      public Boolean isMatriculeExiste(String mat) {
        int nbr=0;
         try{
        PreparedStatement ps=cnx.prepareStatement("select count(*) from vehicule where matricule=?");
              ps.setString(1, mat);
       ResultSet rs=ps.executeQuery();
       rs.next();
       nbr=rs.getInt(1);
        ps.close();
        }
        catch(SQLException e){e.printStackTrace();}
        return (nbr==0)?false:true;    
     }
      public List<Vehicule> findByPartOf(String text,String choice) {
List<Vehicule> lv=new ArrayList();
               try{
                   PreparedStatement ps=null;
               if(choice.equals("LIEU")||choice.equals("CATEGORIE")||choice.equals("MARQUE"))
               { 
                   String table=choice;
                   choice="ID"+choice;
        ps=cnx.prepareStatement("select * from vehicule,"+table+" where vehicule."+choice+"="+table+"."+choice+" and NOM"+table+" like '"+text+"%'");
               }
                else 
        ps=cnx.prepareStatement
        ("select * from vehicule where "+choice+" like '"+text+"%'");

        ResultSet rs=ps.executeQuery();
       while(rs.next())
       {
           Vehicule v=new Vehicule();
         v.setMatricule(rs.getString("matricule"));
       LieuDAO lDAO=new LieuDAO(SingletonConnexion.getInstance());
       v.setLieu(lDAO.read(rs.getInt("idlieu")));
       CategorieDAO cDAO=new CategorieDAO(SingletonConnexion.getInstance());
       v.setCategorie(cDAO.read(rs.getInt("idcategorie")));
       MarqueDAO mDAO=new MarqueDAO(SingletonConnexion.getInstance());
       v.setMarque(mDAO.read(rs.getInt("idmarque")));
       v.setKilometrage(rs.getInt("kilometrage"));
       v.setCouleur(rs.getString("couleur"));
       v.setDateAjout(String.valueOf(rs.getDate("dateajout")));
       lv.add(v);
       }
        ps.close();
        }
        catch(SQLException e){e.printStackTrace();}
        return lv;    }

    @Override
    public void update(Vehicule obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}