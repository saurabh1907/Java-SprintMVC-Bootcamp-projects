<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="WEB-INF/showErrorMessage.jsp" %>

<html>

<head>  
  <link rel="stylesheet" type="text/css" href="default.css">

  <script language="JavaScript">
      function checkAll(field)
      {
          for (i=0; i < field.length; i++)
          {
              field[i].checked = true;
          }
      }
  </script>
</head>

<body>
	<p><%@include file="showImage.jsp"%></p>
  <p><a href="controller?action=addCar">[Add Car]</a></p>
  
  <form name="deleteForm" method="post" action="controller">
  <input type="hidden" name="action" value="deleteCar" />
  <table>    <tr>
      <th><a href="javascript:checkAll(document.deleteForm.id)">Select All</a></th>
      <th>Action</th>      <th>Make</th>      <th>Model</th>      <th class="model-year">Model Year</th>    </tr>        <c:forEach items='${carList}' var='car'>      <tr>
      <td><input type="checkbox" name="id" value="<%-- Set this value to id property of car attribute --%>"></td>
      <td><a href="controller?<%-- Set the value for 'action' parameter to 'editCar' and 'id' parameter to id property of car attribute --%>">Edit</a></td>      <td><%-- Set this value to make property of car attribute --%></td>      <td><%-- Set this value to model property of car attribute --%></td>      <td class="model-year"><%-- Set this value to modelYear property of car attribute --%></td>      </tr>    </c:forEach>
    
    <tr>
      <td colspan="5">
        <input type="submit" name="Delete Checked" value="Delete Checked" />
        &nbsp;&nbsp;
        <input type="reset" name="Reset" value="Reset" />
      </td>
    </tr>
      </table>
  </form></body>

</html>