<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- WE'LL TRY TO LOCATE DATASOURCE (Service Locator pattern) -->
<%
		Context initialContext = new InitialContext();

		Context envContext = (Context)initialContext.lookup("java:comp/env/");

		DataSource ds = (DataSource)envContext.lookup("jdbc/myDS");
		System.out.println(ds);
		
		Connection dbConnection = ds.getConnection();
		System.out.println(dbConnection);
%>

<%
		ApplicationContext appContext;

		appContext = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
		
		ds = (DataSource)appContext.getBean("myDataSource");
		
		System.out.println(ds);
%>















</body>
</html>