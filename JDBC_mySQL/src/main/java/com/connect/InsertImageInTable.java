package com.connect;

import java.sql.*;
import java.io.*;

public class InsertImageInTable {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/customer";
			String user="root";
			String password="Asmit123@";
			Connection connection = DriverManager.getConnection(url,user,password);
			
			String q = "Insert into images(pic) values(?)";
			PreparedStatement pstmt =connection.prepareStatement(q);
			FileInputStream fileInputStream = new FileInputStream("E:\\sign.jpg");
			
			pstmt.setBinaryStream(1,fileInputStream,fileInputStream.available() );
			pstmt.executeUpdate();
			System.out.println("Inserted");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
