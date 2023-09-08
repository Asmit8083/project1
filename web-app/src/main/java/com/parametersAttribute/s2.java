package com.parametersAttribute;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class s2
 */
@WebServlet("/s2")
public class s2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		
		int nn1= Integer.parseInt(request.getParameter("n1"));
		int nn2= Integer.parseInt(request.getParameter("n2"));
		
		int p=nn1*nn2;
		
		int sum = (int)request.getAttribute("sum");
		out.print("<h1>");
		out.println("The sum is " +sum);
		out.println("The product is " +p);
		out.print("</h1>");
	}

}
