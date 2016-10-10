<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.util.Date" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!
		Date dt;

		//dt = new Date();
%>

<%
		Date dt;

		dt = new Date();
		
		java.io.PrintWriter out2;
%><form>
		<input type="checkbox">
	</form>


<%
		out.println(dt);
%>



<%=request.getMethod()%>

<%=dt%>



</body>
</html>