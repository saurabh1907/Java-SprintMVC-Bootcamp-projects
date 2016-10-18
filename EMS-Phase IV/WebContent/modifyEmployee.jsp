<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modify Employee</title>
</head>
<body>
<form action="ControllerServlet" method="post">
<input type="hidden" name= "formType" value = "modifyEmployee">
Name <input type="text" name="name" required pattern="[A-Za-z0-9 ]+" autofocus/><br>
Kin ID <input type="text" name="kinID" required pattern="[A-Za-z0-9]*[A-Za-z][A-Za-z0-9]*" placeholder="Enter unique identification"/><br>
Phone No <input type="tel" name="phoneNo" required maxlength="10" pattern="[0-9]{10}" /><br>
Date of Birth <input type="date" name="dob" required /><br>
Date of Joining <input type="date" name="doj" required /><br>
Address <input type="text" name="address" required value="Address Line 1"/><br>
Department ID <input type="number" name="deptID" size="2" min="1" max="99" required /><br>
Project ID <input type="number" name="projectID" size="2" min="1" max="99" required /><br>
Roles ID <input type="number" name="rolesID" size="2" min="1" max="99" required /><br>
<input type="submit" name="modifyEmployee" value="Submit" /><br><br>
<a href="index.jsp">Home</a>
</form>
</body>
</html>