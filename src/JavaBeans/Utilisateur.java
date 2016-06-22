/***********************************************************************
 * Module:  Utilisateur.java
 * Author:  Moustaid
 * Purpose: Defines the Class Utilisateur
 ***********************************************************************/

package JavaBeans;

import java.util.*;

/** @pdOid 683c8a89-1e61-4e34-afaf-b28ddd1f7cbe */
public class Utilisateur {
   /** @pdOid 8efb72ab-8509-45e6-8798-0f53b598ef99 */
   private java.lang.String matriculeUser;
   /** @pdOid bd17f562-b6db-4e35-a9a8-b421e3aea6f5 */
   private java.lang.String nomUser;
   /** @pdOid 833ec18b-e5f9-4f76-adf2-642ea4428a22 */
   private java.lang.String prenomUser;
   /** @pdOid ba56b1d1-2fbb-450b-9a26-55787d1f4694 */
   private java.lang.String password;
   private java.lang.String shema;
   
   /** @pdOid 46f5db08-4e03-44a9-b414-9cb5d8d11178 */
   public java.lang.String getMatriculeUser() {
      return matriculeUser;
   }
   
   /** @param newMatriculeUser
    * @pdOid 526a15cf-b9fa-4666-9896-4328d5a05ffe */
   public void setMatriculeUser(java.lang.String newMatriculeUser) {
      matriculeUser = newMatriculeUser;
   }
   
   /** @pdOid 582489fe-3fcf-49cd-a726-5af6ff780bba */
   public java.lang.String getNomUser() {
      return nomUser;
   }
   
   /** @param newNomUser
    * @pdOid 02735e7a-b05a-44aa-9102-6fefce31c0f0 */
   public void setNomUser(java.lang.String newNomUser) {
      nomUser = newNomUser;
   }
   
   /** @pdOid 32efe2ae-d805-41fc-bc00-028884a6dca8 */
   public java.lang.String getPrenomUser() {
      return prenomUser;
   }
   
   /** @param newPrenomUser
    * @pdOid 322238a8-1eb6-4163-abdf-360ce5c7ebac */
   public void setPrenomUser(java.lang.String newPrenomUser) {
      prenomUser = newPrenomUser;
   }
   
   /** @pdOid 74e2415b-d8ea-4c21-8a01-446f0e7952f8 */
   public java.lang.String getPassword() {
      return password;
   }
   
   /** @param newPassword
    * @pdOid fa3608ea-7cc9-41b5-a212-e55d14acf308 */
   public void setPassword(java.lang.String newPassword) {
      password = newPassword;
   }

    public java.lang.String getShema() {
        return shema;
    }

    public void setShema(java.lang.String shema) {
        this.shema = shema;
    }

}