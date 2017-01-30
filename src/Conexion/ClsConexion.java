package Conexion;
import java.sql.Connection;
import com.mysql.jdbc.jdbc2.optional.*;
import javax.swing.*;


public class ClsConexion {
   private static Connection cnxmysql = null;
   //Hello World!
   public Connection getConnection(){
       try {
           // MYSQL Server
           MysqlConnectionPoolDataSource ds = new MysqlConnectionPoolDataSource();
//           ds.setServerName("us-cdbr-azure-southcentral-f.cloudapp.net"); //ip,nombre,domino
//           ds.setPort(3306);
//           ds.setDatabaseName("sistemasupt");
//           cnxmysql = ds.getConnection("b2fe0e0d9cd109","d27f4f27");          

           
           ds.setServerName("localhost"); //ip,nombre,domino
           ds.setPort(3306);
           ds.setDatabaseName("sistemasupt");
           cnxmysql = ds.getConnection("root","root123");          
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Error de conexión a la BD");
       }
       return cnxmysql;
   }
}
