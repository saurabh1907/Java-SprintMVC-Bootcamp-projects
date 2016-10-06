<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.util.Map"%>
<%@page import="com.seed.beans.Product"%>
<%@page import="com.seed.util.ProductsRepository"%>
<%@page import="com.seed.util.ProductsRepositoryInMemoryImpl"%>
<%@page import="com.seed.beans.ShoppingCart"%>
<%@page import="java.util.Set"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!

//	TODO:0 Don't modify this JSP DECLARATION

	private Map<Integer, Product> productEntries;
	
	@Override
	public void init() throws ServletException {
		ProductsRepository repositoryRef;
	
	//	The member variable "productEntries" refers to Map object,
	//	which is pointing to object with product details.
	//	These details will be read from in-memory collection.
	//	Please, note ProductsRepositoryInMemoryImpl is provided 
	//	as third-party code in /WEB-INF/lib
		
		repositoryRef = new ProductsRepositoryInMemoryImpl();
		productEntries = repositoryRef.getProductEntries();
		System.out.println("productEntries "+ productEntries);
	}

%>


<h2>List of selected product ids 
<br/>
<jsp:useBean id="wishList" type="com.seed.beans.ShoppingCart" scope="session"/>

<jsp:getProperty name="wishList" property="productSet" />
</h2>

Wish List content
<br/>

<table>
<%
//		TODO:1 If the attribute(shoppingCart) exists, retrieve product ids from it.

//		TODO:2	Scan all productids retrieved from Cart and maintain a list of corresponding products	
//		Note: You can get details of product(value) based on productid(key) 
//		using member variable "productEntries"

%>

<%-- 
		TODO:3	display product details in tabular format as HTTP response(text/html) to the web-client
--%>

			<tr>
				<td><%-- TODO:4 required JSP EXPRESSION to display id of product--%></td>
				<td><%-- TODO:5 required JSP EXPRESSION to display name of product--%></td>
				<td><%-- TODO:6 required JSP EXPRESSION to display price of product--%></td>
			</tr>
	

</table>

</body>
</html>