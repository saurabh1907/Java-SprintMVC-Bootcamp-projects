<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Get All Employee</title>
</head>
<body>
<form action="ControllerServlet" method="post">
<input type="hidden" name= "formType" value = "showAll">
<input type="submit" name="showAll" value="show all" /><br><br>
<a href="index.jsp">Home</a>
</form>
</body>
</html>