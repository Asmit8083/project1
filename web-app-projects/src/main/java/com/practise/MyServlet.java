package com.practise;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class MyServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{
		System.out.println("This is get method");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
	    out.print("<h1>This is get method of my servlet</h1>");	
	    out.print(new Date().toString());
	}
	

}
