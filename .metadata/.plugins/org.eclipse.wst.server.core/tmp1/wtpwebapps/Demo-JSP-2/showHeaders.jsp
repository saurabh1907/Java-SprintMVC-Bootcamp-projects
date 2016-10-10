<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page session="false"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
<%
{
	System.out.println("This page is translated and complied; instantiation is also completed");
	out.println();
}

		Enumeration<String> names =request.getHeaderNames();

		while(names.hasMoreElements()){
			String name = names.nextElement();
			String value = request.getHeader(name);
%>
	
		<tr>
			<td><%=name%></td>
			<td><%=value%></td>
		</tr>
		

<%
		}
%>

</table>












</body>
</html>