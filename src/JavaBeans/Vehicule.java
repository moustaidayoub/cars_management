/***********************************************************************
 * Module:  Vehicule.java
 * Author:  Moustaid
 * Purpose: Defines the Class Vehicule
 ***********************************************************************/

package JavaBeans;

import java.util.*;

/** @pdOid 8128773f-49b4-470c-808b-d40b5357212b */
public class Vehicule {
   /** @pdOid ee5d301e-5bcb-4454-935b-ac9f74f5c2fb */
   private java.lang.String matricule;
   /** @pdOid 0237a33b-2755-419c-a2ba-eec0450a91a9 */
   private int kilometrage;
   /** @pdOid ee645c70-2df1-4b9f-b4c6-2c13ebdfa27e */
   private java.lang.String couleur;
 
   /** @pdOid af9f381c-f3a1-4ea7-9d6e-0686b9f0addd */
   private String dateAjout;
    private Categorie categorie;
     private Lieu lieu;
      private Marque marque;
   
   /** @pdOid 537fc9c4-fea3-4efc-a9c3-759c531e3d07 */
   public java.lang.String getMatricule() {
      return matricule;
   }
   
   /** @param newMatricule
    * @pdOid bb576ccb-732b-4799-b109-2a58c1819df7 */
   public void setMatricule(java.lang.String newMatricule) {
      matricule = newMatricule;
   }
   
   /** @pdOid 5c6c88f1-b0b1-474f-b9df-4a1c5cc86969 */
   public int getKilometrage() {
      return kilometrage;
   }
   
   /** @param newKilometrage
    * @pdOid 2f78f815-cddf-466a-b721-cc05a09d29e3 */
   public void setKilometrage(int newKilometrage) {
      kilometrage = newKilometrage;
   }
   
   /** @pdOid e05942aa-de3e-4d4f-9cc0-1807ced275bb */
   public java.lang.String getCouleur() {
      return couleur;
   }
   
   /** @param newCouleur
    * @pdOid 1a079117-8e26-4e42-8f1c-db58159fc433 */
   public void setCouleur(java.lang.String newCouleur) {
      couleur = newCouleur;
   }
   

   
   /** @pdOid 841197e8-a131-464b-af01-260f183d2776 */
   public String getDateAjout() {
      return dateAjout;
   }
   
   /** @param newDateAjout
    * @pdOid ba82762f-23bb-44ca-a07b-ba633d684f62 */
   public void setDateAjout(String newDateAjout) {
      dateAjout = newDateAjout;
   }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Lieu getLieu() {
        return lieu;
    }

    public void setLieu(Lieu lieu) {
        this.lieu = lieu;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

}