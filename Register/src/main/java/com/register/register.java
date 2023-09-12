package com.register;

import jakarta.servlet.http.HttpServlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.sql.*;

@MultipartConfig
public class register extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name= request.getParameter("name");
		String email= request.getParameter("email");
		String pass= request.getParameter("password");
		Part part= request.getPart("image");
		String fileName = part.getSubmittedFileName();

		try {
			
			Thread.sleep(3000);
			Connection connection = DatabaseConnection.initializeDatabase();
			System.out.println("inserting statements");
			String q = "Insert into user(user_name,pass,email,image) values(?,?,?,?)";
			PreparedStatement pstmt= connection.prepareStatement(q);
			pstmt.setString(1,name);
			pstmt.setString(2, pass);
			pstmt.setString(3, email);
			pstmt.setString(4, fileName);
			
			pstmt.executeUpdate();
			
			InputStream iStream= part.getInputStream();
			byte[] data = new byte[iStream.available()];
			
			iStream.read(data);
			
			String path = request.getServletContext().getRealPath("/")+"images"+File.separator + fileName;
			FileOutputStream  fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			
			out.println("done");
			connection.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			out.println("error");
		}
	}

}
