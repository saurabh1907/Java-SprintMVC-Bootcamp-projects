package com.seed;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.seed.beans.Product;
import com.seed.util.ProductsRepository;
import com.seed.util.ProductsRepositoryInMemoryImpl;

//	TODO:0 Don't modify this class

public class MyContextListener implements ServletContextListener{
	@Override
	public void contextInitialized(ServletContextEvent event) {
		ProductsRepository productsRepositoryRef;
		productsRepositoryRef = new ProductsRepositoryInMemoryImpl();

		Map<Integer, Product> productEntries = productsRepositoryRef.getProductEntries();

		ServletContext application = event.getServletContext();

//		Assign scoped variable names(attribute) for product repository in APPLICATION_SCOPE
		String productMapAttributeID = "entries.products";
		application.setAttribute(productMapAttributeID, productEntries);
		
//		Assign scoped variable names(attribute) for ids in product repository in APPLICATION_SCOPE
		String productIdsAttributeID = "productIds";
		application.setAttribute(productIdsAttributeID, productEntries.keySet());
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
