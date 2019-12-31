package com.capgemini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.mywebapp.bean.EmploeeInfoBean;
import com.capgemini.mywebapp.service.EmployeeService;
import com.capgemini.mywebapp.service.EmployeeServiceImpl;


@WebServlet("/searchEmployee")
public class SearchEmployeeServlet extends HttpServlet {
	
    EmployeeService employeeService = new EmployeeServiceImpl();
    
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Get the form data
		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);            
		EmploeeInfoBean emploeeInfoBean = employeeService.serachEmployee(empId);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		if(emploeeInfoBean!=null) {
			out.println("<h3>Employee ID "+ empId + "Found </h3>");
			out.println("<br>Name = "+emploeeInfoBean.getName());
			out.println("<br>Age = "+emploeeInfoBean.getAge());
			out.println("<br>Designation = "+emploeeInfoBean.getDesignation());
			out.println("<br>Salary= "+emploeeInfoBean.getSalary());
		}else {
			out.println("<h3 style = 'color:red'> Employee ID" + empId +"Not Found" + "</h3>");
			
		}
		out.println("</body>");
		out.println("</html>");
		
	}//end of doget

}//end of class
