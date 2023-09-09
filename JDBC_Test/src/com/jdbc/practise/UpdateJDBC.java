package com.jdbc.practise;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class UpdateJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection connection= ConnectionProvider.getConnection();
			
			String qString= "Update table1 set name=? ,city=? where id=?";
			BufferedReader bReader= new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter name");
			String name = bReader.readLine();
			System.out.println("Enter city");
			String city = bReader.readLine();
			System.out.println("Enter id");
			int id = Integer.parseInt(bReader.readLine());
			
			PreparedStatement pStatement= connection.prepareStatement(qString);
			pStatement.setString(1, name);
			pStatement.setString(2, city);
			pStatement.setInt(3, id);
			
			pStatement.executeUpdate();
			System.out.println("Upadated");
			
			connection.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
