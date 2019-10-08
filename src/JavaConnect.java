import java.sql.*;
import javax.swing.JOptionPane;

public class JavaConnect {
    Connection conn;
    
    public static Connection ConnectorDb() {
        try{
            Class.forName("org.sqlite.JDBC");
            return conn;
        }catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
         return null;
        }
    }
}
