/***********************************************************************
 * Module:  GeneriqueDAO.java
 * Author:  Moustaid
 * Purpose: Defines the Class GeneriqueDAO
 ***********************************************************************/

package DAO;

import java.sql.Connection;
import java.util.*;

/** @pdOid 59cd2e16-6a86-42a1-8e96-d9afef85f68b */
public abstract class GeneriqueDAO <A,B> {
   /** @pdOid 12bcf135-194c-445d-a5e1-7948e00e5095 */
   protected Connection cnx = null;
   
   /** @param cnx
    * @pdOid 9a7338b3-34ad-4419-9422-5f3ead8e4bfa */
   public GeneriqueDAO(Connection cnx) {
      this.cnx=cnx;
   }
   
   /** @param obj
    * @pdOid 605fd260-2a4d-4e50-aca8-4993c97b7e6b */
   public abstract void create(A obj);
   
   /** @param id
    * @pdOid 73065b4d-8ac6-41fe-84da-001bf5918497 */
   public abstract A read(B id);
   
   /** @param obj
    * @pdOid a1439973-f887-4cb7-a8ba-2ecc5af837b0 */
   public abstract void update(A obj);
   
   /** @param id
    * @pdOid 93f14794-abdb-4378-bcbc-75ddd95aaef0 */
   public abstract void delete(B id);
   
   /** @pdOid 2d919a88-242a-400d-bac0-290a0150e798 */
   public abstract List<A> readAll();
    
   public abstract int getMaxId();
}