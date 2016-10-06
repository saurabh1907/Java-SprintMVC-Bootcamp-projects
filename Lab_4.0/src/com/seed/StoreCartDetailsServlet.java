package com.seed;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//TODO:0	Modification required
public class StoreCartDetailsServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		TODO:1	Obtain session created for client
//		if session is not created, ask container to create it.
		
//		TODO:2	Retrieve attribute named as "shoppingCart" in session scope
//		assign it to "cartRef" local variable (you need casting to ShoppingCart) 
		
//		TODO:3 If "shoppingCart" does not exist, create object of com.seed.beans.ShoppingCart referenced by "cartRef"
//		and assign "shoppingCart" as attribute name for this newly created ShoppingCart

//		TODO:4	Read product ids from request parameter named as "bookID"
		
//		TODO:5 add these product ids in the ShoppingCart object referenced by "cartRef" local variable

//		TODO:6	if the user clicks "Shop More?" in "bookCatelogue.html", 
//		then redirect web-client to resource named as "categories.html"
		
//		TODO:7	if the user clicks "Check Out" in "bookCatelogue.html", 
//		then instead of redirecting web-client to resource named as "displayDetails"
//		forward the current request to Servlet named as "DisplayCartDetailsServlet".
//		Please remember, in WEB.XML file there is no mapping for "DisplayCartDetailsServlet"
		
	}
	
}









