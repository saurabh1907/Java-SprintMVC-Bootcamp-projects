Objective:
-------------

This project shows the problems related to maintainingVIEW component of web application. 

Existing resources:
--------------------------------

1.categories.html:-						This page will display product categories.
  
2.Class_Diagram.GIF:-					This image will describe java classes that needs to be created.   

3.Lab_4.0_Utility.jar:-					This jar contains a type named as ProductsRepositoryFromPersistanceImpl.
												ProductsRepositoryFromPersistanceImpl reads product details from database.
												
4.context.xml								This file defines a reference lookup name to an external resource(database).

5.ServiceLocator.java:-					This class will enable us to interact with JNDI resource configured by the container.
  														 
6.ServiceLocatorException.java:-		This is custom exception specific to ServiceLocator.

7.MyContextListener.java:-				This is a servlet context listener which makes database Connection 
												and product repository available in APPLICATION_SCOPE.
												
8.sqlqueries_sql.txt:-						SQL queries for required database tables

9.StoreCartDetailsServlet.java:-		This servlet should maintain ids of products selected by web-client into Shopping Cart.
												There should be one cart per client.
														 
10.DisplayCartDetailsServlet.java:-	This servlet should read product ids from Shopping Cart and display 
												corresponding	product details in tabular format as html response to the web client.
												and insert order details into database.
														
11.BookCatalogueServlet.java			This servlet should present book names form repository								
														
12.web.xml:-								This is the deployment descriptor for the web application.

Note:
-------

This project is dependent on "Lab_2.0" [JAVA EE MODULE DEPENDENCY].
There is no bookCatelogue.html in this project. It is replaced with BookCatalogueServlet.java.
Please, do not make changes in EXISTING RESOURCES.


														