/***********************************************************************
 * Module:  Division.java
 * Author:  Moustaid
 * Purpose: Defines the Class Division
 ***********************************************************************/

package JavaBeans;

import java.util.*;

/** @pdOid 32bd3bfa-8913-42f8-8b35-5f0789c46f5a */
public class Division {
   /** @pdOid 05a287fd-b9bd-408b-8178-1580a9184fc9 */
   private int idDivision;
   /** @pdOid 7e753406-51e1-407b-9b5b-9c9d3a95f07f */
   private java.lang.String nomDivision;
   
   /** @pdRoleInfo migr=no name=Lieu assc=gerer coll=java.util.List impl=java.util.ArrayList mult=1..* side=A */
   public java.util.List<Lieu> lieu;
   
   /** @pdOid 33756429-cf10-4238-95ea-5455e48e7c93 */
   public int getIdDivision() {
      return idDivision;
   }
   
   /** @param newIdDivision
    * @pdOid 8b923f99-829e-40d1-ace3-2566a3b3c17e */
   public void setIdDivision(int newIdDivision) {
      idDivision = newIdDivision;
   }
   
   /** @pdOid 84883bad-a372-468c-83c2-2696abfb744f */
   public java.lang.String getNomDivision() {
      return nomDivision;
   }
   
   /** @param newNomDivision
    * @pdOid 00283a75-9aaa-44b2-8eb9-85bae26f5386 */
   public void setNomDivision(java.lang.String newNomDivision) {
      nomDivision = newNomDivision;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.List<Lieu> getLieu() {
      if (lieu == null)
         lieu = new java.util.ArrayList<Lieu>();
      return lieu;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorLieu() {
      if (lieu == null)
         lieu = new java.util.ArrayList<Lieu>();
      return lieu.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newLieu */
   public void setLieu(java.util.List<Lieu> newLieu) {
      removeAllLieu();
      for (java.util.Iterator iter = newLieu.iterator(); iter.hasNext();)
         addLieu((Lieu)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newLieu */
   public void addLieu(Lieu newLieu) {
      if (newLieu == null)
         return;
      if (this.lieu == null)
         this.lieu = new java.util.ArrayList<Lieu>();
      if (!this.lieu.contains(newLieu))
         this.lieu.add(newLieu);
   }
   
   /** @pdGenerated default remove
     * @param oldLieu */
   public void removeLieu(Lieu oldLieu) {
      if (oldLieu == null)
         return;
      if (this.lieu != null)
         if (this.lieu.contains(oldLieu))
            this.lieu.remove(oldLieu);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllLieu() {
      if (lieu != null)
         lieu.clear();
   }

}