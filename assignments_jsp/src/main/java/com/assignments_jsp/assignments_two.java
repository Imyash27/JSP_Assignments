package com.assignments_jsp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/assignments")
public class assignments_two extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ServletContext context=null;
    
    public assignments_two() {
       
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException 
    {
    	context=config.getServletContext();
    	
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("Call using servlet Context");
		
		String user=context.getInitParameter("User");
		String pass=context.getInitParameter("Pass");
		out.println("<br>");
		out.println("username : "+user);
		out.println("password : "+pass);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

}
