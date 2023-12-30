package nazihan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connection_TO_db {
        public static Connection doConnection() throws ClassNotFoundException, SQLException {
        try{
        String url="jdbc:mysql://127.0.0.1/nazihan_afrida";
        String user="root";
        String passward="";
       Class.forName("com.mysql.jdbc.Driver");
       Connection cn=(Connection)DriverManager.getConnection(url, user, passward);
       return cn;
    }
        catch (Exception e){
            System.out.println("Connection could not built");
            return null;
        }
    }
}
