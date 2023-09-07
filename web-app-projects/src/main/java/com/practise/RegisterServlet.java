package com.practise;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class RegisterServlet extends HttpServlet {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("html");
		PrintWriter out= response.getWriter();
	    out.print("<h1>Welcome to register servlet</h1>");	
	    String name= request.getParameter("name");
	    String password=request.getParameter("password");
	    String email=request.getParameter("email");
	    String gender=request.getParameter("gender");
	    String course= request.getParameter("course");
	    String condition=request.getParameter("condition");
	    if(condition.equals("checked")) {
	    	out.print("<h2> Name: "+ name + "<h2>");
	    	out.print("<h2> Password: "+ password + "<h2>");
	    	out.print("<h2> Email: "+ email + "<h2>");
	    	out.print("<h2> Gender: "+ gender + "<h2>");
	    	out.print("<h2> Course: "+ course + "<h2>");
	    }
	    else{
	    	out.println("you have not agreed to terms and condition");
	    }
	}

}
