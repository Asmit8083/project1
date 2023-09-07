package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class SecondServlet extends GenericServlet{
	
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("This is servlet using generic servlet");
		PrintWriter out= resp.getWriter();
		out.print("<h1> This is my output from Second servlet</h1>");
		out.print("<h1>Today date is "+ new Date().toString()+"</h1>");
	}

}
