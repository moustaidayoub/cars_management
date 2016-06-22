/***********************************************************************
 * Module:  Lieu.java
 * Author:  Moustaid
 * Purpose: Defines the Class Lieu
 ***********************************************************************/

package JavaBeans;

import java.util.*;

/** @pdOid 356eebe3-8dfe-4aea-993f-091d6593a9e2 */
public class Lieu {
   /** @pdOid aabdedc8-6b6e-4fad-80ae-c18ba6e142d9 */
   private int idLieu;
   /** @pdOid b9a420ed-1cb3-452f-813d-f8225a0a1a59 */
   private java.lang.String nomLieu;
      private Division division;

   /** @pdOid 869a7ee8-be31-4541-9dc2-6cd765fd1f6e */
   private java.lang.String ville;
   
   /** @pdRoleInfo migr=no name=Vehicule assc=concerner coll=java.util.List impl=java.util.ArrayList mult=0..* side=A */
   public java.util.List<Vehicule> vehicule;
   
   /** @pdOid 93233513-b869-4b57-89bd-7a3a05d1f91b */
   public int getIdLieu() {
      return idLieu;
   }
   
   /** @param newIdLieu
    * @pdOid 6d092f80-fc83-4ab0-a1b3-c7b89f968fd9 */
   public void setIdLieu(int newIdLieu) {
      idLieu = newIdLieu;
   }
   
   /** @pdOid 1cf0bc9f-adbb-4d7a-a9f6-db261ed9b96c */
   public java.lang.String getNomLieu() {
      return nomLieu;
   }
   
   /** @param newNomLieu
    * @pdOid 10ff4192-a51b-409f-b224-ead94274d49d */
   public void setNomLieu(java.lang.String newNomLieu) {
      nomLieu = newNomLieu;
   }
   
   /** @pdOid e08f749b-7fd3-462f-bc12-9e1aa148eeed */
   public java.lang.String getVille() {
      return ville;
   }
   
   /** @param newVille
    * @pdOid f78015fc-f787-4dc9-a837-42a7692703c2 */
   public void setVille(java.lang.String newVille) {
      ville = newVille;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.List<Vehicule> getVehicule() {
      if (vehicule == null)
         vehicule = new java.util.ArrayList<Vehicule>();
      return vehicule;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorVehicule() {
      if (vehicule == null)
         vehicule = new java.util.ArrayList<Vehicule>();
      return vehicule.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newVehicule */
   public void setVehicule(java.util.List<Vehicule> newVehicule) {
      removeAllVehicule();
      for (java.util.Iterator iter = newVehicule.iterator(); iter.hasNext();)
         addVehicule((Vehicule)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newVehicule */
   public void addVehicule(Vehicule newVehicule) {
      if (newVehicule == null)
         return;
      if (this.vehicule == null)
         this.vehicule = new java.util.ArrayList<Vehicule>();
      if (!this.vehicule.contains(newVehicule))
         this.vehicule.add(newVehicule);
   }
   
   /** @pdGenerated default remove
     * @param oldVehicule */
   public void removeVehicule(Vehicule oldVehicule) {
      if (oldVehicule == null)
         return;
      if (this.vehicule != null)
         if (this.vehicule.contains(oldVehicule))
            this.vehicule.remove(oldVehicule);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllVehicule() {
      if (vehicule != null)
         vehicule.clear();
   }
       public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

}