package com.assignments_jsp;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class assign_one extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   ServletConfig config=null;
    public assign_one() {
        
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException 
    {
    	this.config=config;
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("Call using servlet config file see the url pattern");
		
		String username=config.getInitParameter("Username");
		String password=config.getInitParameter("Password");
		out.println("<br>");
		out.println("username : "+username);
		out.println("password : "+password);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

}
