/***********************************************************************
 * Module:  SingletonConnexion.java
 * Author:  Moustaid
 * Purpose: Defines the Class SingletonConnexion
 ***********************************************************************/

package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;

/** @pdOid 2a89835a-b64f-4612-a183-ae03a634a770 */
public class SingletonConnexion {
   /** @pdOid 323e8974-3262-4415-943c-80b4afa59543 */
   private static java.lang.String urlBD="jdbc:mysql://localhost:3306/bd_ocp";
   /** @pdOid cdbc20f9-4774-460b-95af-eeb7bdfd532e */
   private static java.lang.String userBD="root";
   /** @pdOid 43749d3d-bc70-47da-ae9b-14f7abd7d566 */
   private static java.lang.String passwordBD="";
   /** @pdOid d6f71dfa-0c5d-43fc-98e9-fd8a486a2b04 */
   private static Connection connect = null;
   
   /** @pdOid 8e56a9ce-ffe1-48f9-80dc-03d4926414cc */
   private SingletonConnexion() {
       try{
      Class.forName("com.mysql.jdbc.Driver");
      connect=DriverManager.getConnection(urlBD, userBD, passwordBD);
      }
      catch(Exception e){e.printStackTrace();}
   }
   
   /** @pdOid 029e6975-647e-436e-bd09-6cbc2057959a */
   public static Connection getInstance() {
      if(connect==null)
      {
      new SingletonConnexion();
      }
      return connect;
   }

}