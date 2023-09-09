package com.connect;

import java.sql.*;
import java.io.*;

public class DynamicInputbyUserduringRunTime {

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
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter name");
			String name = br.readLine();
			
			System.out.println("Enter city name");
			String city = br.readLine();
			
			//set the values to query
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			
			pstmt.executeUpdate();
			System.out.println("Inserted.....");
			connection.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
