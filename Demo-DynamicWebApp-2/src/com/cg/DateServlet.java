package com.cg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/getDate")
public class DateServlet extends HttpServlet{
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
	}
	
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		super.doGet(req, resp);
		System.out.println(getServletContext().getContextPath());
		
/*		HttpSession session = request.getSession();
		
		System.out.println(session.getId());
*/		
		System.out.println(request.isRequestedSessionIdFromCookie());
		System.out.println(request.isRequestedSessionIdFromURL());
		
		PrintWriter out = response.getWriter();
		
		out.println("Hello, world!");
		
		Date currentDate = new Date();
		
		System.out.println(Thread.currentThread().getName());
		
		out.println(currentDate);
		
		
		
		
		
		
		
		
	}
	
	
}
