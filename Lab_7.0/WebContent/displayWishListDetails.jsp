<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page import="java.util.Map"%>
<%@page import="com.seed.beans.Product"%>
<%@page import="com.seed.util.ProductsRepository"%>
<%@page import="com.seed.util.ProductsRepositoryInMemoryImpl"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>

<h2> 
Customer Billing details
<br/>

<%-- TODO:1 Use standard action (jsp:usebean) to obtain scoped variable "userDetails" from session scope--%>


<%-- TODO:2 get "name" property of "userDetails" and display it--%>

<%-- TODO:3 get "mobile" property of "userDetails" and display it--%>

<%-- TODO:4 get "pincode" property of "userDetails" and display it--%>


<%-- TODO:5 Use JSTL action (forEach) and EL EXPRESSIONS to display product details from 
		scoped variable "wishList" using its property "productSet"
--%>

<br/><br/>
Wish-List contents
<br/>

<table>
	<c:forEach items="<%-- TODO:6 required EL EXPRESSION to get property of wishList--%>" var="productId">
	
		<tr>
			<td><%-- TODO:7 required EL EXPRESSION to display id of product--%></td>
			<td><%-- TODO:8 required EL EXPRESSION to display name of product--%></td>
			<td><%-- TODO:9 required EL EXPRESSION to display id of product--%></td>
		</tr>
	
	</c:forEach>
	

</table>
</h2>

</body>
</html>