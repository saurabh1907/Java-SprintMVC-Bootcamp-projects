package com.seed;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//	TODO:1 Make DisplayCartDetailsServlet as a HttpServlet

@WebServlet("/displayDetails")
public class DisplayCartDetailsServlet extends HttpServlet{

//	TODO:2 	Provide call-back method (called by web container) for HTTP request made using HTTP GET method
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//super.doGet(req, resp);
	PrintWriter writer = resp.getWriter();
	resp.setContentType("text/html");
	String selection[]= req.getParameterValues(("bookName"));
	for(String item:selection)
	writer.println(item + "<br>");
	
}
	//	TODO:3	This method should read products selected by web-client from bookCatelogue.html and 
//					display them in tabular format as html response to the web client.	
}









