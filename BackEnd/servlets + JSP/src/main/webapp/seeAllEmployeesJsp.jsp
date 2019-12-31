<%@page import="com.capgemini.mywebapp.bean.EmploeeInfoBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session="false" %>
    <%List<EmploeeInfoBean> employeeList =(List<EmploeeInfoBean>) request.getAttribute("emploeeInfoList") ;
    String msg = (String)request.getAttribute("msg");
    
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>seeAllEmployeesJsp</title>
</head>
<body>

	<h4><a href="./home">Home</a></h4>
	<%if(employeeList != null && !(employeeList.isEmpty())){ %>
	<table>
		<tr>
			<th>EmpId</th>
			<th>Name</th>
			<th>Age</th>
			<th>Designation</th>
			<th>Salary</th>
		</tr>
		<%for(EmploeeInfoBean emploeeInfoBean : employeeList) {%>
			<tr>
				<td><%= emploeeInfoBean.getEmpid() %></td>
				<td><%=emploeeInfoBean.getName() %></td>
				<td><%=emploeeInfoBean.getAge() %></td>
				<td><%=emploeeInfoBean.getDesignation() %></td>
				<td><%=emploeeInfoBean.getSalary() %></td>
			</tr>
		<%} %>
	</table>

	<%} %>
	
	<%if(msg!=null && !msg.isEmpty()) {%>
		<h3 style="color: red;"><%= msg %></h3>
		
	<%} %>
	
</body>
</html>