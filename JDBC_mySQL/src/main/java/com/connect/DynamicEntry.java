package com.connect;
import java.sql.*;

public class DynamicEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/customer";
			String user="root";
			String password="Asmit123@";
			Connection connection = DriverManager.getConnection(url,user,password);
			
			//create a query
			String q="Insert into table1(name,city) values(?,?)";
			
			PreparedStatement pstmt =  connection.prepareStatement(q);
			
			//set the values to query
			pstmt.setString(1, "Asmit Singh");
			pstmt.setString(2,"Pune");
			
			pstmt.executeUpdate();
			System.out.println("Inserted.....");
			connection.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
