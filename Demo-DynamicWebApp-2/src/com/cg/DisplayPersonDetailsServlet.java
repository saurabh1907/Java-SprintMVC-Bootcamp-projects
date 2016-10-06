package com.cg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/displayDetails")
public class DisplayPersonDetailsServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Person p2 = (Person) request.getAttribute("pd");
		
		PrintWriter out = response.getWriter();
		out.println("<h2>"+p2.getName()+"</h2>");
		out.println("<h2>"+p2.getAge()+"</h2>");
		
		
		
		
	}
}
