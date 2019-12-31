<%@page import="com.oracle.webservices.internal.api.EnvelopeStyle.Style"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page session="false" %>
   
  <%String msg = (String)request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UpdateJsp</title>
</head>
<body>
	<h4> <a href = "./home"> Home</a></h4>
	<fieldset>
		<legend>Update Employee</legend>
		<form action="./updateEmployee2" method="post">
		   <table>
		   		<tr>
		   			<td>Employee Id</td>
		   			<td>:</td>
		   			<td><input type="number" name="empId" required> 
		   		</tr>
		   		
		   		<tr>
		   			<td>Employee Name</td>
		   			<td>:</td>
		   			<td><input type="text" name="name" > 
		   		</tr>
		   		
		   		<tr>
		   			<td>Employee Age</td>
		   			<td>:</td>
		   			<td><input type="number" name="age" > 
		   		</tr>
		   		
		   		<tr>
		   			<td>Salary</td>
		   			<td>:</td>
		   			<td><input type="number" name="salary" > 
		   		</tr>
		   		
		   		<tr>
		   			<td>Designation</td>
		   			<td>:</td>
		   			<td><input type="text" name="designation" > 
		   		</tr>
		   		
		   		<tr>
		   			<td>Password</td>
		   			<td>:</td>
		   			<td><input type="password" name="password" > 
		   		</tr>
		   		
		   		<tr>
		   			<td colspan="3" align="center"><br>
		   			  <input type="submit" value="Update" required> 
		   			 </td>
		   		</tr>
		   </table>
		</form>
	</fieldset>
	<%if(msg!=null && !msg.isEmpty()){ %>
		<h3 style="color: red"><%= msg%></h3>
	<%} %>

</body>
</html>