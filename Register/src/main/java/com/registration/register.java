package com.registration;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.*;
import java.io.*;


public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<body>");
		
		String name= request.getParameter("name");
		String email= request.getParameter("email");
		String pass= request.getParameter("password");
		
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/customer";
		String user="root";
		String password="Asmit123@";
		
		Connection connection= DriverManager.getConnection(url,user,password);
		System.out.println("connection");
		String q = "Insert into user(user_name,pass,email) values(?,?,?)";
			PreparedStatement pstmt= connection.prepareStatement(q);
			out.println("<h1>done12.....</h1>");
			pstmt.setString(1,name);
			pstmt.setString(2, pass);
			pstmt.setString(3, email);
			
			pstmt.executeUpdate();
			
			out.println("<h1>done11.....</h1>");
			connection.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		
		
		out.println("</body>");
	}

}
