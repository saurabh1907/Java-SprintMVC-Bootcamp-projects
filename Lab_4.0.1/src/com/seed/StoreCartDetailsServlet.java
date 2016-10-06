package com.seed;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.seed.beans.Book;
import com.seed.beans.Product;
import com.seed.beans.ShoppingCart;

public class StoreCartDetailsServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ShoppingCart cartRef = null;
		
		HttpSession session = request.getSession(true);		
		cartRef = (ShoppingCart) session.getAttribute("cartID");
		
		if(cartRef == null){
			cartRef = new ShoppingCart();
			session.setAttribute("cartID", cartRef);
			
			System.out.println("Client's session is started, now "+ session.getId());
		}
		else{
			System.out.println("Client is still in session "+ session.getId());	
		}

		String[] productIds = request.getParameterValues("bookID");		
		cartRef.setProductList(productIds);
		
		if(request.getParameter("continue") != null){
			response.sendRedirect("categories.html");
		
		}else{
			RequestDispatcher dispatcher = getServletContext().getNamedDispatcher("DisplayCartDetailsServlet");
			dispatcher.forward(request, response);
		}
		
	}
	
}









