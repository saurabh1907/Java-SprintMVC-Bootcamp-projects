package com.seed;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspWriter;

import com.seed.beans.Product;

/**
 * Servlet implementation class BookCatalogueServlet
 */
public class BookCatalogueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PreparedStatement selectStatement;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		ServletContext application = this.getServletContext();

		Connection dbConnectionRef = null;
//		TODO:2 Populate local variable "dbConnectionRef" with object in APPLICATION_SCOPE named as "database.connection"
		
		dbConnectionRef = (Connection)application.getAttribute("database.connection");
		
		try {
			String selectQuery = this.getServletConfig().getInitParameter("query.select");
			selectStatement = dbConnectionRef.prepareStatement(selectQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =  response.getWriter();
		
		out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
		out.write("<html>\r\n");
		out.write("<head>\r\n");
		out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
		out.write("<title>Insert title here</title>\r\n");
		out.write("</head>\r\n");
		out.write("<body>\r\n");
		out.write("\r\n");
		out.write("<form action=\"storeDetails\" method=\"post\">\r\n");
		out.write("\t<h1>Select books</h1>\r\n");
		out.write("\r\n");
		
		try {
			ResultSet result = selectStatement.executeQuery();
			
			while(result.next()){
				out.write("\t<input type=\"checkbox\" name=\"bookID\"");
				out.write(" value=\"" + result.getInt("productID")+ "\"/>");
				out.write(result.getString("name")+ "\r\n<br/>");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
//		out.write("\t<input type=\"checkbox\" name=\"bookID\" value=\"1\"/>Product#1\r\n");
//		out.write("\t<input type=\"checkbox\" name=\"bookID\" value=\"2\"/>Product#2\r\n");
//		out.write("\t<input type=\"checkbox\" name=\"bookID\" value=\"3\"/>Product#3\r\n");
		out.write("\r\n");
		out.write("\t<br/>\r\n");
		out.write("\t<input type=\"submit\" value=\"Shop More?\" name=\"continue\"/>\r\n");
		out.write("\t<input type=\"submit\" value=\"Check Out\" name=\"checkout\"/>\r\n");
		out.write("\r\n");
		out.write("</form>\r\n");
		out.write("\r\n");
		out.write("\r\n");
		out.write("\r\n");
		out.write("</body>\r\n");
		out.write("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
