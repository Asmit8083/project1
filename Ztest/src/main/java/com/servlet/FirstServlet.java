package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.*;
public class FirstServlet implements Servlet{
	
	ServletConfig config;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		System.out.println("creating objects.....");
	}
	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("Servicing.......");
		//set the content type of response
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<h1> This is my output from servlet</h1>");
		out.print("<h1>Today date is "+ new Date().toString()+"</h1>");
	}

	@Override
	public void destroy() {
		System.out.println("Going to destroy Servlet object");
	}

	@Override
	public ServletConfig getServletConfig() {
		return this.config;
	}

	@Override
	public String getServletInfo() {
		return "this servlet is created by Asmit Singh";
	}

}
 