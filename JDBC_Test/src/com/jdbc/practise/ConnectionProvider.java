package com.jdbc.practise;

import java.sql.*;

public class ConnectionProvider {
	
	private static Connection connection;
	
	public static Connection getConnection() {
		try {
			if(connection==null) {
				Class.forName("com.mysql.jdbc.Driver");
				
				String url="jdbc:mysql://localhost:3306/customer";
				String user="root";
				String password="Asmit123@";
				
				connection= DriverManager.getConnection(url,user,password);
			    
		   }
		}
		  catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return connection;
	}
	  
}
