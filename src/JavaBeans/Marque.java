/***********************************************************************
 * Module:  Marque.java
 * Author:  Moustaid
 * Purpose: Defines the Class Marque
 ***********************************************************************/

package JavaBeans;

import java.util.*;

/** @pdOid b712d828-6ab3-4313-8a8e-8dddc55faf30 */
public class Marque {
   /** @pdOid ebcb34cc-bca4-4679-b60f-a5bf60823fb9 */
   private int idMarque;
   /** @pdOid 5a36e215-d2cb-4fa7-b3fe-33d9d2ab6f4b */
   private java.lang.String nomMarque;
   
   /** @pdRoleInfo migr=no name=Vehicule assc=avoir coll=java.util.List impl=java.util.ArrayList mult=0..* side=A */
   public java.util.List<Vehicule> vehicule;
   
   /** @pdOid 0cce9b84-5884-4c8c-8e6e-6daaea1ae1cf */
   public int getIdMarque() {
      return idMarque;
   }
   
   /** @param newIdMarque
    * @pdOid bda874db-07c1-4c2e-a84f-c78b9ec49d75 */
   public void setIdMarque(int newIdMarque) {
      idMarque = newIdMarque;
   }
   
   /** @pdOid 5fd1305a-eb2b-4d62-8469-adff4bee92df */
   public java.lang.String getNomMarque() {
      return nomMarque;
   }
   
   /** @param newNomMarque
    * @pdOid 580a4bf4-7601-4205-bbe5-aaf1c42db98a */
   public void setNomMarque(java.lang.String newNomMarque) {
      nomMarque = newNomMarque;
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