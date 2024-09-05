import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MySqlConnection 
{
    public static void main(String[] args) 
    {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "";
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } 
        catch (ClassNotFoundException e) 
        {
            System.err.println("MySQL JDBC driver not found!");
            e.printStackTrace();
            return;
        }
        try (Connection connection = DriverManager.getConnection(url, user, password)) 
        {
            if (connection != null) 
            {
                System.out.println("Connected to the MySQL server successfully!");
            } 
            else 
            {
                System.out.println("Failed to connect to the MySQL server!");
            }
        } 
        catch(SQLException e)
        {
            System.err.println("Error connecting to the MySQL server!");
            e.printStackTrace();
        }
    }
}
