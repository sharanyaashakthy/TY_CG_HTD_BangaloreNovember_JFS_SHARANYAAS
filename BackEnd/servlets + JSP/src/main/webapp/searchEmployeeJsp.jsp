<%@page import="com.capgemini.mywebapp.bean.EmploeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page session="false" %>

<% EmploeeInfoBean emploeeInfoBean = (EmploeeInfoBean)request.getAttribute("emploeeInfoBean"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SearchEmployeeJsp</title>
</head>
<body>
	<fieldset>
		<legend>Search Employee</legend>
		<form action="./searchEmployee3" method="get">
			Employee Id : <input type="number" name="empId" required> <br>
			<input type = "submit" value="search">
		</form>
	</fieldset>
	<br><br>
	
	<%if(emploeeInfoBean == null){ %>
		<h3 style="color: red;"> Employee ID not found </h3>
	<%} else {%>
	<h3 style="color: red;"> Employee ID for <%= emploeeInfoBean.getEmpid() %></h3><br>
	Employee Name = <%=emploeeInfoBean.getName() %><br>
	Age = <%=emploeeInfoBean.getAge() %><br>
	Salary = <%=emploeeInfoBean.getSalary() %>
	Designation = <%= emploeeInfoBean.getDesignation() %>
	<%} %>
	
	
	
</body>
</html>