package com.seed;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.seed.beans.Product;
import com.seed.beans.ShoppingCart;

public class DisplayCartDetailsServlet extends HttpServlet {
	private Map<Integer, Product> productEntries;
	private PreparedStatement insertStatement;
	
	@Override
	public void init() throws ServletException {
		ServletContext application = this.getServletContext();

		String productMapAttributeID = "entries.products";
		productEntries = (Map<Integer, Product>) application
				.getAttribute(productMapAttributeID);
		
		Connection dbConnectionRef = null;
//		TODO:2 Populate local variable "dbConnectionRef" with object in APPLICATION_SCOPE named as "database.connection"
		
		dbConnectionRef = (Connection)application.getAttribute("database.connection");
		
		try {
			String insertQuery = "insert into orders values(?,?,?)";
			insertStatement = dbConnectionRef.prepareStatement(insertQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		ShoppingCart cartRef = null;

		HttpSession session = request.getSession(false);

		if (session == null) {
			out.println("<h1>Session expired!</h1>");
			out.println("<h2><a href='categories.html'>See Categories, again</a></h2>");
			return;
		}

		cartRef = (ShoppingCart) session.getAttribute("cartID");

		if (cartRef != null) {
			out.println("<html><body>");

			out.println("<table>");

			Set<Integer> listOfProductIds = cartRef.getProductSet();		
			
			for (int productID : listOfProductIds) {
				Product productRef = productEntries.get(productID);
				out.println("<tr>");
				out.println("<td>" + productRef.getId() + "</td>");
				out.println("<td>" + productRef.getName() + "</td>");
				out.println("<td>" + productRef.getPrice() + "</td>");
				out.println("</tr>");
			}

			out.println("</table>");

			out.println("</body></html>");
			
//			inserting order entries in database
			
			try {
				for (int productID : listOfProductIds){
					insertStatement.setInt(1, productID);
					
					String clientID = session.getId();					
					insertStatement.setString(2, clientID);
					
					int quantity = 1;
					insertStatement.setInt(3, quantity);
					
					insertStatement.executeUpdate();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

}
