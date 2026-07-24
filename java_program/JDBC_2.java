import java.sql.*;
public class JDBC_2 
{
public static void main(String[] args)
{
	String url = "jdbc:mysql://localhost:3306/kdk";
    String user = "root";
    String password = "shrushti02@1";
    
     try
     {
    	 Class.forName("com.mysql.cj.jdbc.Driver");
    	 Connection con = DriverManager.getConnection(url,user,password);
    	 System.out.println("Database connected successfully");
    	 Statement st = con.createStatement();
    	 String createTable = "Create table if not exists  "
    	 		+ "students( "+"std_no int primary key,"
    	 		          +"std_name varchar(100),"
    	 		          +"stipend double)";
    	 st.executeUpdate(createTable);
    	 System.out.println("Table created successfully");
    	 
    	 //insert the data
    	 String insertData = "insert into students "
    	 		+ "(std_no,std_name,stipend)"
    			 +"values(?,?,?)";
    	 
    	 PreparedStatement pst = con.prepareStatement(insertData);
    	 
    	 pst.setInt(1,111);
    	 pst.setString(2, "Shrushti");
    	 pst.setDouble(3,1523.59);
    	 pst.executeUpdate();
    	 
    	 pst.setInt(1,112);
    	 pst.setString(2, "Dev");
    	 pst.setDouble(3,1333.59);
    	 pst.executeUpdate();
    	 
    	 pst.setInt(1,113);
    	 pst.setString(2, "Kiran");
    	 pst.setDouble(3,14523.59);
    	 pst.executeUpdate();
    	 
    	 pst.setInt(1,114);
    	 pst.setString(2, "Ram");
    	 pst.setDouble(3,1723.59);
    	 pst.executeUpdate();
    	 
    	 pst.setInt(1,115);
    	 pst.setString(2, "Shyam");
    	 pst.setDouble(3,1823.59);
    	 pst.executeUpdate();
    	 
    	 System.out.println("Records inserted successfully");
    	 con.close();
     }
     catch(Exception e)
     {
    	 
     }
 }
}
