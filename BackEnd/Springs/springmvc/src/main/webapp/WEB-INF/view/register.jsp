<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>register.jsp</title>
</head>
<body>
  <form action="./register" method="post">
	<fieldset>
		<legend>Employee Details</legend>
			<table>
				  <tr>
				    <td>Employee Name</td>
				    <td>:</td>
				    <td><input type="text" name="name" required></td>
				  </tr>
				  <tr>
				    <td>Email</td>
				    <td>:</td>
				    <td><input type="email" name="email" required></td>
				  </tr>
				  <tr>
				  	<td>password</td>
				  	<td>:</td>
				  	<td><input type="password" name="password" required></td>
				  </tr>
				</table>
	</fieldset>
	
	<fieldset>
		<legend>Employee Address Details1</legend>
			<table>
				<tr>
					<td>Address Type:</td>
					<td><select name="addressBeans[0].addType" size="1" id="">
			             <option value="Permanent Address">Permanent</option>
			             <option value="Temporary Address">Temporary</option>
   				         </select></td>
				</tr>
				<tr>
					<td>Address1:</td>
					<td><input type="text" name="addressBeans[0].address1"></td>
				</tr>
				<tr>
					<td>Address2:</td>
					<td><input type="text" name="addressBeans[0].address2"></td>
				</tr>			
			</table>
	</fieldset>
	
	<fieldset>
		<legend>Employee Address Details2</legend>
		    <table>
		    	<tr>
					<td>Address Type:</td>
					<td><select name="addressBeans[1].addType" size="1" id="">
			             <option value="Permanent Address">Permanent</option>
			             <option value="Temporary Address">Temporary</option>
   				         </select></td>
				</tr>
			
				<tr>
					<td>Address1:</td>
					<td><input type="text" name="addressBeans[1].address1"></td>
				</tr>
				<tr>
					<td>Address2:</td>
					<td><input type="text" name="addressBeans[1].address2"></td>
				</tr>			
			</table>
	</fieldset>
	
	<table>
		<tr>
			<td colspan="3" align="center"><br>
			  <input type="submit" value="Register" required>
			</td>
	   </tr>
	</table>
</form>
	
	
	

</body>
</html>