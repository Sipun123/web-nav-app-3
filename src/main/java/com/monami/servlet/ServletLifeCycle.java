package com.monami.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletLifeCycle extends HttpServlet
{

	public ServletLifeCycle()
	{	
		System.out.println("Am from default constructor");
	}

	public void init(ServletConfig config)
	{
		System.out.println("Am from Init method...!");
	}

	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{	System.out.println("I am from service method");
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("I am from doGet method");
		pw.close();
	}	

	public void destroy()
	{
		System.out.println("Am from Destroy methods");
	}

}