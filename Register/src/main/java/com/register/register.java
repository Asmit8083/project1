package com.register;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.*;

public class register extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name= request.getParameter("name");
		String email= request.getParameter("email");
		String pass= request.getParameter("password");

		try {
			
			Thread.sleep(3000);
			Connection connection = DatabaseConnection.initializeDatabase();
			System.out.println("inserting statements");
			String q = "Insert into user(user_name,pass,email) values(?,?,?)";
			PreparedStatement pstmt= connection.prepareStatement(q);
			pstmt.setString(1,name);
			pstmt.setString(2, pass);
			pstmt.setString(3, email);
			
			pstmt.executeUpdate();
			out.println("done");
			connection.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			out.println("error");
		}
	}

}
