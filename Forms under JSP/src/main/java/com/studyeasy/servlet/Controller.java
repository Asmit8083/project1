package com.studyeasy.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Controller() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println(request.getParameter("name") );
		
		PrintWriter out=response.getWriter();
		String[] languages= request.getParameterValues("language");
		  if(languages!=null){
			  for(int i=0;i<languages.length;i++){
				  out.println(languages[i]);
			  }
		  }
		  else{
			  out.print("Not selected any language");
		  }
		  
		//response.getWriter().println(request.getParameter("language")+"<br/>");
		response.getWriter().println(request.getParameter("gender"));
		response.getWriter().println(request.getParameter("country"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.getWriter().println(request.getParameter("name") );
		
		PrintWriter out=response.getWriter();
		String[] languages= request.getParameterValues("language");
		  if(languages!=null){
			  for(int i=0;i<languages.length;i++){
				  out.println(languages[i]);
			  }
		  }
		  else{
			  out.println("Not selected any language");
		  }
		  
		//response.getWriter().println(request.getParameter("language")+"<br/>");
		response.getWriter().println(request.getParameter("gender"));
		response.getWriter().println(request.getParameter("country"));
	}

}
