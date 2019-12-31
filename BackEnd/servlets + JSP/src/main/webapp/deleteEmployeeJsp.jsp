<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page session=" false"  %>
    <%String msg = (String)(request.getAttribute("msg")); %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>deleteEmployeeJsp</title>
</head>
<body>
	<fieldset>
		<legend>Delete Employee</legend>
		<form action="./deleteEmployee2" method="get">
		    Employee Id : <input type="number" name="empId" required> <br>
			<input type = "submit" value="Delete">
		</form>
	</fieldset>
	<br><br>
	
	<%if(msg != null && !msg.isEmpty()){ %>
		<h3 style="color: red;"> <%=msg %></h3>
	<%} %>
	
	

</body>
</html>