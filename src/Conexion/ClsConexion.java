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
//           ds.setServerName("localhost"); //ip,nombre,domino
//           ds.setPort(3306);
//           ds.setDatabaseName("sistemaupt");
//           cnxmysql = ds.getConnection("root","");          
           
           ds.setServerName("stevie.heliohost.org"); //ip,nombre,domino
           ds.setPort(3306);
           ds.setDatabaseName("dreirar_sistemaupt");
           cnxmysql = ds.getConnection("dreirar_admin","Sistemas123");          
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Error de conexión a la BD");
       }
       return cnxmysql;
   }
}
