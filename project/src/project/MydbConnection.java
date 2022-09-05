package project;

import java.sql.Connection;
import java.sql.DriverManager;

public class MydbConnection {
	
	
	public Connection con;
	public Connection getMyconnection()
	{
		
		try {
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/result1","root","abhi");  
		
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		return con;
		
	} 
}
