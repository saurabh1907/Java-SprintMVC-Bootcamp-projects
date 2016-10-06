package com.seed;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.sql.DataSource;

import com.seed.beans.Product;
import com.seed.util.ProductsRepository;
import com.seed.util.ProductsRepositoryFromPersistanceImpl;
import com.seed.util.ServiceLocator;
import com.seed.util.ServiceLocatorException;

//TODO:0	Don't modify this resource
public class MyContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent event) {
		try {
			
//			Get database connection object using DataSource retrieved from ServiceLocator
			DataSource dataSource = ServiceLocator.getDataSource("jdbc/ShoppingAppDataSource");
			Connection dbConnection = dataSource.getConnection();
			
//			Get ProductsRepository from database.
//			ProductsRepositoryFromPersistanceImpl is provided as part of third-party code
			ProductsRepository productsRepositoryRef;
			productsRepositoryRef = new ProductsRepositoryFromPersistanceImpl(dbConnection);

			Map<Integer, Product> productEntries = productsRepositoryRef.getProductEntries();

//			Assign scoped variable names(attribute) for database connection and product repository in APPLICATION_SCOPE
			ServletContext application = event.getServletContext();

			String productMapAttributeID = "entries.products";
			application.setAttribute(productMapAttributeID, productEntries);
			
			String sqlConnectionID = "database.connection";
			application.setAttribute(sqlConnectionID, dbConnection);
			
		} catch (ServiceLocatorException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
	}

}
