import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	 public static Connection getConnection() throws Exception{
		  try{
		   String driver = "com.mysql.jdbc.Driver";
		   String url = "jdbc:mysql://localhost:3306/test_db";
		   String username = "root";
		   String password = "";
		   Class.forName(driver);
		   
		   Connection conn = DriverManager.getConnection(url,username,password);
		   System.out.println("Connected");
		   return conn;
		   
		  } catch(Exception e){System.out.println(e);}
		  
		  
		  return null;
		 }
	 public static void main(String[] args) {
		try {
			getConnection();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
