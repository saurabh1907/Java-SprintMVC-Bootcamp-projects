<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Employee</title>
</head>
<body>
<form action="ControllerServlet" method="post">
<input type="hidden" name= "formType" value = "searchEmployee">
Enter employee ID or KinID<input type="text" name="nameOrID" required pattern="[A-Za-z0-9]+" />
<input type="submit" name="addEmployee" value="Submit" /><br><br>
<a href="index.jsp">Home</a>
</form>
</body>
</html>