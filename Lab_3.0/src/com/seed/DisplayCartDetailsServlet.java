package com.seed;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.seed.beans.Product;
import com.seed.beans.ShoppingCart;
import com.seed.util.ProductsRepository;
import com.seed.util.ProductsRepositoryInMemoryImpl;

//TODO:0	Modification required
public class DisplayCartDetailsServlet extends HttpServlet {
	private Map<Integer, Product> productEntries;
	
//	TODO:1 Don't make any changes in this method
	@Override
	public void init() throws ServletException {
		ProductsRepository repositoryRef;

//		The member variable "productEntries" refers to Map object,
//		which is pointing to object with product details.
//		These details will be read from in-memory collection.
//		Please, note ProductsRepositoryInMemoryImpl is provided 
//		as third-party code in /WEB-INF/lib
		
		repositoryRef = new ProductsRepositoryInMemoryImpl();
		productEntries = repositoryRef.getProductEntries();
		System.out.println("productEntries "+ productEntries);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		ShoppingCart cartRef = null;

//		Don't create a new session, if it is already expired
		HttpSession session = request.getSession(false);

		if (session == null) {
			out.println("<h1>Session expired!</h1>");
			out.println("<h2><a href='categories.html'>See Categories, again</a></h2>");			
			return;
		}
		
//		TODO:1	Retrieve attribute named as "shoppingCart" from session scope,
//		and assign it to "cartRef" local variable


//		TODO:2 If the attribute(shoppingCart) exists, retrieve product ids from it.
		
//		TODO:3 If the attribute(shoppingCart) exists, retrieve product ids from it.
		
//		TODO:4	Scan all productids retrieved from Cart and maintain a list of corresponding products	
//		Note: You can get details of product(value) based on productid(key) 
//		using member variable "productEntries"		
			
//		TODO:5	display product details in tabular format as HTTP response(text/html) to the web-client
			
	}

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

}
