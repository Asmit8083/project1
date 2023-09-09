package com.connect;
import java.sql.*;

public class Connect1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection =                 DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","root","Asmit123@");
			Statement statement=connection.createStatement();
			System.out.println("inserting statements");
			String sql="Insert into money values(5)";
			statement.executeUpdate(sql);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
