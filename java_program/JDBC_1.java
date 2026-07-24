//step1 : import.java.sql package
import java.sql.*;
public class JDBC_1 
{
	public static void main(String[] args) 
	{	
        String url = "jdbc:mysql://localhost:3306/";     //format
        String user = "root";
        String password = "shrushti02@1";
       
        try 
        {
        	//step2 : load and register driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //step3 : connect to database
            Connection con = DriverManager.getConnection(url,user,password);
            System.out.println("Database connected successfully");
            
            //step4: write the statement/query
            Statement st = con.createStatement();
            String q = "create database kdk";
            
            //step5 : execute the statement/query
            st.executeUpdate(q); 
            
            //step6 : Result
            System.out.println("Database created successfully");
            
            //step7 : close the connection
            con.close();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }   
	}
}











