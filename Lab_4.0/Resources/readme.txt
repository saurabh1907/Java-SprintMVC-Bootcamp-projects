Objective:
-------------

To understand database connectivity in the context of web application.

Existing resources:
--------------------------------

1.categories.html:-							This page will display product categories.
2.bookCatelogue.html:-						This page will display book catalogue.  
3.Class_Diagram.GIF:-					This image will describe java classes that needs to be created.   
4.Lab_4.0_Utility.jar:-						This jar contains a type named as ProductsRepositoryFromPersistanceImpl.
														ProductsRepositoryFromPersistanceImpl reads product details from database.
5.context.xml									This file defines a reference lookup name to an external resource(database).
6.ServiceLocator.java:-					This class will enable us to interact with JNDI resource configured by the container.  														 
7.ServiceLocatorException.java:-	This is custom exception specific to ServiceLocator.
8.MyContextListener.java:-				This is a servlet context listener which makes database Connection 
														and product repository available in APPLICATION_SCOPE.
9.sqlqueries_sql.txt:-						SQL queries for required database tables

Update following resources:
------------------------------------

1.StoreCartDetailsServlet.java:-		This servlet should maintain ids of products selected by web-client into Shopping Cart.
														There should be one cart per client.
														 
2.DisplayCartDetailsServlet.java:-	This servlet should read product ids from Shopping Cart and display 
														corresponding	product details in tabular format as html response to the web client.
														and insert order details into database.
														
2.web.xml:-										This is the deployment descriptor for the web application.

Note:
-------

This project is dependent on "Lab_2.0" [JAVA EE MODULE DEPENDENCY].
Please, do not make changes in EXISTING RESOURCES.

														