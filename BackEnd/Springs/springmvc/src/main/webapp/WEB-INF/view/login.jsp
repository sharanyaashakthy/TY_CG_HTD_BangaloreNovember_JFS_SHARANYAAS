<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page  session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login.jsp</title>
</head>
<body>
	<form action="./login" method="post">
		<table>
		  <tr>
		    <td>User Name</td>
		    <td><input type="text" name = "username"></td>
		  </tr>
		  <tr>
		     <td>Password</td>
		    <td><input type="password" name = "password"></td>
		  </tr>
		  <tr>
		    <td><input type="submit" name = "login"></td>
		  </tr>
		</table>

		
	</form>

</body>
</html>