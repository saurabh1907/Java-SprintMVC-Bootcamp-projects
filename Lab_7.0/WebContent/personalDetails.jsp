<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page import="com.seed.beans.Customer"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form method="post">Name: <input style="width: 163px" name="name"><br>
<br>
Mobile: <input style="width: 163px" name="mobile"><br>
<br>
Pin Code<input style="width: 163px" name="pincode"> <br>
<br>
<br>
<input type="submit" value="Submit" name="submit" style="width: 57px">
&nbsp; <input type="reset" style="width: 57px"></form>

<%-- TODO:1 execute todos from 2 to 4 only if user submits the form using POST method --%>

<c:if test='${pageContext.request.method eq "POST"}'>

<%-- TODO:2 Use standard action (jsp:usebean) to obtain scoped variable "userDetails" from session scope--%>

	<jsp:useBean id="userDetails" class="com.seed.beans.Customer"
		scope="session" />

<%-- TODO:3 set all properties of "userDetails" java bean from coresponding HTML request parameters--%>
	<jsp:setProperty name="userDetails" property="*" />

	<%--  TODO:4 forward current request to "displayWishListDetails.jsp"--%>
	
	<jsp:forward page="displayWishListDetails.jsp" />
</c:if>

</body>
</html>