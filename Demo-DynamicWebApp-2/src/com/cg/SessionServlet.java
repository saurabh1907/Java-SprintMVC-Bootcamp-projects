package com.cg;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/testSession")
public class SessionServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		Cookie cookie = new Cookie("Sample","Sample");
		response.addCookie(cookie);
		
		System.out.println(session.getId());
		
	/*	
		RequestDispatcher dispatcher = request.getRequestDispatcher("/getDate");
		
		dispatcher.forward(request, response);*/
		
		String encodedUrl = response.encodeURL("getDate");
		
		response.sendRedirect(encodedUrl);
		
		
		
		
		
	
	}


}
