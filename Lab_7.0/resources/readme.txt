Objective:
-------------

To write script-free JSP pages.
To use standard jsp actions.
To use EL expressions.
To use JSTL actions.


Existing resources:
--------------------------------

1.categories.html:-							This page will display product categories.
  
2.Lab_3.0_Utility.jar:-						This jar contains a type named as ProductsRepositoryInMemoryImpl.
													ProductsRepositoryInMemoryImpl reads product details from in-memory collection.
													
3.jstl-1.2.jar:-									This jar contains ready to use JSTL tags.
													 
4.web.xml:-										This is the deployment descriptor for the web application.

5.MyContextListener.java:-					This is a servlet context listener which makes product repository 
													available in APPLICATION_SCOPE.

Update following resources:
------------------------------------

1.bookCatelogue.jsp:-						This page will display book catalogue.

2.storeWishListDetails.jsp:-					This jsp should maintain ids of products selected by web-client into Shopping Cart.
													There should be one cart per client.
													
3.personalDetails.jsp:-						This page will ask customer billing details.							
														 
4.displayWishListDetails.jsp:-				This jsp should read product ids from Shopping Cart and display 
													corresponding	product details in tabular format as html response to the web client.
														
Note:
-------

This project is dependent on "Lab_2.0" [JAVA EE MODULE DEPENDENCY].
Please, do not make changes in EXISTING RESOURCES.


														