<%@page import="com.capgemini.mywebapp.bean.EmploeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page session="false" %>
    
 <% HttpSession session =  request.getSession(false); %>
 <%EmploeeInfoBean emploeeInfoBean = (EmploeeInfoBean) session.getAttribute("emploeeInfoBean") ;%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page JSP</title>
</head>
<body>
	<h3 style="color: navy;"> Welcome<%= emploeeInfoBean.getName() %> </h3>
	<a href="./addEmployee2"> Add Employee</a><br>
	<a href="./updateJsp"> Update Employee</a><br>
	<a href="./searchEmployeeJsp"> Search Employee</a><br>
	<a href="./seeAllEmployees"> See All Employees</a><br>
	<a href="./deleteEmployeeJsp"> Delete Employee</a><br>
	<br>
	<a href="./logout2"> Logout</a>
	
</body>
</html>