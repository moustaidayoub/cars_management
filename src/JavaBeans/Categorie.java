/***********************************************************************
 * Module:  Categorie.java
 * Author:  Moustaid
 * Purpose: Defines the Class Categorie
 ***********************************************************************/

package JavaBeans;

import java.util.*;

/** @pdOid b16112c1-62c5-4434-89ee-a62943b9ad5a */
public class Categorie {
   /** @pdOid 89bcc110-f79a-451e-a3d6-ffe9e49af645 */
   private int idCategorie;
   /** @pdOid be947eba-379a-4f02-9de6-5f40672052af */
   private java.lang.String nomCategorie;
   
   /** @pdRoleInfo migr=no name=Vehicule assc=appartenir coll=java.util.List impl=java.util.ArrayList mult=0..* side=A */
   public java.util.List<Vehicule> vehicule;
   
   /** @pdOid 1eb145ad-f4ac-4abc-9881-7da62d1fb898 */
   public int getIdCategorie() {
      return idCategorie;
   }
   
   /** @param newIdCategorie
    * @pdOid 03f58519-5a1f-428b-9246-42dcdfe64e97 */
   public void setIdCategorie(int newIdCategorie) {
      idCategorie = newIdCategorie;
   }
   
   /** @pdOid cf5c10fa-60e1-49c0-9a68-333fded1a182 */
   public java.lang.String getNomCategorie() {
      return nomCategorie;
   }
   
   /** @param newNomCategorie
    * @pdOid 7a48e557-0214-47e9-96cb-264da3439968 */
   public void setNomCategorie(java.lang.String newNomCategorie) {
      nomCategorie = newNomCategorie;
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

}