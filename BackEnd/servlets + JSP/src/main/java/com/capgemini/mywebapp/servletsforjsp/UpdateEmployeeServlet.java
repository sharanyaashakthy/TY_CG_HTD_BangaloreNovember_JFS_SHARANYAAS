package com.capgemini.mywebapp.servletsforjsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.mywebapp.bean.EmploeeInfoBean;
import com.capgemini.mywebapp.service.EmployeeService;
import com.capgemini.mywebapp.service.EmployeeServiceImpl;


@WebServlet("/updateEmployee2")
public class UpdateEmployeeServlet extends HttpServlet {
	
	private EmployeeService service = new EmployeeServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session != null) {
			//valid session
			int empId = Integer.parseInt(req.getParameter("empId"));
			String name = req.getParameter("name");
			String ageVal = req.getParameter("age");
			String designation = req.getParameter("designation");
			String salaryVal =req.getParameter("salary");
			String password = req.getParameter("password");
			
			
			
			//set into the object
			EmploeeInfoBean emploeeInfoBean = new EmploeeInfoBean();
			emploeeInfoBean.setEmpid(empId);
			emploeeInfoBean.setName(name);
			if(ageVal != null && !ageVal.isEmpty()) {
				int age = Integer.parseInt(ageVal);
				emploeeInfoBean.setAge(age);
			}
			emploeeInfoBean.setDesignation(designation);
			if(salaryVal != null && !salaryVal.isEmpty()) {
				double salary = Double.parseDouble(salaryVal);
				emploeeInfoBean.setSalary(salary);
			}
			emploeeInfoBean.setPassword(password);
			
			boolean isUpdated = service.addEmployee(emploeeInfoBean);
			if(isUpdated) {
				req.setAttribute("msg", "Employee record is updated successfully");
			}else {
				req.setAttribute("msg", "Unable to update employee record");
			}
			req.getRequestDispatcher("./updateJsp").forward(req, resp);
		}else {
			//Invalid session
			req.setAttribute("msg", "Please login first");
			req.getRequestDispatcher("./loginFormJsp").forward(req, resp);
		}
	}

}
