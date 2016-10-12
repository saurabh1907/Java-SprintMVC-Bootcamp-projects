<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
<form action="ControllerServlet" method="post">
Kin ID <input type="text" name="kinID"/><br>
Phone No <input type="text" name="phoneNo" /><br>
Date of Birth <input type="text" name="dateOfBirth" /><br>
Date of Joining <input type="text" name="dateOfJoining" /><br>
Address <input type="text" name="address" value="Address"/><br>
Department ID <input type="text" name="departmentID" /><br>
Project ID <input type="text" name="projectID" /><br>
Roles ID <input type="text" name="rolesID" /><br>
<input type="submit" name="addEmployee" value="Submit" /><br><br>
<a href="index.jsp">Home</a>
</form>
</body>
</html>