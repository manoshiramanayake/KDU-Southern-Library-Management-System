import java.sql.*;
import javax.swing.JOptionPane;

public class JavaConnect {
    Connection conn;
    
    public static Connection ConnectorDb() {
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:E:/KDU/SE Project Docs/KDU Southern Library Management System/db/lms.db");
            return conn;
        }catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
         return null;
        }
    }
}
