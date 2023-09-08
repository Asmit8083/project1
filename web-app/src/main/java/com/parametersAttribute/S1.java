package com.parametersAttribute;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/S1")
public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String n1= request.getParameter("n1");
		String n2= request.getParameter("n2");
		
		int nn1=Integer.parseInt(n1);
		int nn2=Integer.parseInt(n2);
		
		int s= nn1+nn2;
		request.setAttribute("sum", s);
		RequestDispatcher rd = request.getRequestDispatcher("s2");
		rd.forward(request, response);
	}

}
