package project;
import java.sql.*;

public class connectionProvider{
    public static Connection getCon()
    
    {  
        try
        {  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/medicalinventory","root","OmTandel@2001");
            return con;
        }
        catch(Exception e)
        {
         return null;
        }  
    }  
}  