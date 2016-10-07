package com.cg.util;

import java.io.IOException;
import java.rmi.Naming;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

public class SimpleDSServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			
	
//			DriverManager.getConnection(url);
			try {
				DataSource ds = ServiceLocator.getDataSource();
				Connection dbConnection = ds.getConnection();
				
				System.out.println("connection obtained!"+(dbConnection != null ));
				
				if(ds != null){
					ServletContext application = getServletConfig().getServletContext();
					
					application.setAttribute("myDS", ds);
				}
				
				
				
			} catch (SQLException | NamingException e2) {
				e2.printStackTrace();
			}
			
	}
}










