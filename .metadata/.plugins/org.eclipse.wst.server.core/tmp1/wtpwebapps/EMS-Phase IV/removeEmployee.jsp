<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Remove Employee</title>
</head>
<body>
<form action="ControllerServlet" method="post">
<input type="hidden" name= "formType" value = "removeEmployee">
Enter employee ID<input type="text" name="employeeID" required pattern="[0-9]+" autofocus/>
<input type="submit" name="removeEmployee" value="Submit" /><br><br>
<a href="index.jsp">Home</a>
</form>
</body>
</html>