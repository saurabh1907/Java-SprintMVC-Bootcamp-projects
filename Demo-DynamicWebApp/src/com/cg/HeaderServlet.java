package com.cg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/headers/*")
public class HeaderServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		System.out.println(request.getRequestURL());
		System.out.println(request.getQueryString());
		Enumeration<String> params = request.getParameterNames();
		
		while(params.hasMoreElements()){
			String name = params.nextElement();
			System.out.print(name+":");
			String value = request.getParameter(name);
			System.out.println(value);
		}
		
		
		Enumeration<String> headerNames = request.getHeaderNames();
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("<table border='1'>");
		
		while(headerNames.hasMoreElements()){
			String name = headerNames.nextElement();
			String value = request.getHeader(name);
			
			out.println("<tr>");
			out.println("<td>"+name +"</td>");
			
			out.println("<td>"+value + "</td>");
			out.println("</tr>");
		}
		
		out.println("</table>");
		out.println("</body></html>");
	}
	
	
	
	
}
