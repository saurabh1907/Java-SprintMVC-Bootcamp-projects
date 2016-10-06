<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- TODO:1 Use standard action (jsp:usebean) to obtain scoped variable "wishList" from session scope--%>

<jsp:useBean id="wishList" class="com.seed.beans.ShoppingCart" scope="session"/>

<%-- TODO:2 set "productList" property of "wishList"with request parameter "bookID"
		value attribute of setProperty action should be set using EL EXPRESSION
--%>

<jsp:setProperty name="wishList" property="productList"  
			value="${paramValues.bookID}"
			/>

<%-- TODO:3 Use JSTL action to redirect current request to "personalDetails.jsp"
		 if user clicks on "check out" button
--%>

<c:if test="${param.checkout ne null}">
	<c:redirect url="personalDetails.jsp"/>
</c:if>

<%-- TODO:4 Use JSTL action to redirect current request to "bookCatelogue.jsp" 
		if user clicks on "Add to Wish List & shop more?" button
--%>

<c:if test="${param.addToList ne null}">
	<c:redirect url="categories.html"/>
</c:if>

</body>
</html>