package com.jdbc.practise;

import java.io.*;
import java.sql.*;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Connection connection= ConnectionProvider.getConnection();		
			
			String q = "Insert into images(pic) values(?)";
			
			PreparedStatement pstmt = connection.prepareStatement(q);
			
			FileInputStream fileInputStream = new FileInputStream("E:\\IMG_20230728_094751_933.jpg");
			
			pstmt.setBinaryStream(1, fileInputStream, fileInputStream.available());
			pstmt.executeUpdate();
			System.out.println("Inserted");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
