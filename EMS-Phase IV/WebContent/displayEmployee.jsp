<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>ID</th>
<th>Name</th>
<th>KinID</th>
<th>Phone No</th>
<th>Date of Birth</th>
<th>Date of Joining</th>
</tr>
<c:forEach items='${empList}' var='empData' >
<tr>
<td>${empData['id']}</td>
<td>${empData['name']}</td>
<td>${empData['kinID']}</td>
<td>${empData['phoneNo']}</td>
<td>${empData['dob']}</td>
<td>${empData['doj']}</td>
</tr>
</c:forEach>
</table>

<a href="index.jsp">Home</a>
</body>
</html>