
import com.sun.jdi.connect.spi.Connection;
import java.sql.*;


public class ConnectionClass{
    public static Connection getConnection() throws Exception{
        
//        Class.forName("com.mysql.jdbc.Driver");
        Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dartgallerydatabase","root","pwd123");
       
        //con=(Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dartgallerydatabase","root","pwd123");
        if(con!=null)
        {
            System.out.println("Connection Established");
        }
        else
            System.out.println("Connection failed");
        
        return con;
    }
}
