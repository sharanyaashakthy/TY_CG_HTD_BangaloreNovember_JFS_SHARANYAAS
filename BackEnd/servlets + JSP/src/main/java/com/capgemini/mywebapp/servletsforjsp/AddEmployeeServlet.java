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
@WebServlet("/addEmployeeJsp")
public class AddEmployeeServlet extends HttpServlet {
	
	private EmployeeService service =new EmployeeServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		if(session !=null) {
			//valid session
			//get the form data
			int empId = Integer.parseInt(req.getParameter("empId"));
			String name = req.getParameter("name");
			int age = Integer.parseInt(req.getParameter("age"));
			String designation = req.getParameter("designation");
			double salary = Double.parseDouble(req.getParameter("salary"));
			String password = req.getParameter("password");
			
			//set into the object
			EmploeeInfoBean emploeeInfoBean = new EmploeeInfoBean();
			emploeeInfoBean.setEmpid(empId);
			emploeeInfoBean.setName(name);
			emploeeInfoBean.setAge(age);
			emploeeInfoBean.setDesignation(designation);
			emploeeInfoBean.setSalary(salary);
			emploeeInfoBean.setPassword(password);
			
			boolean isAdded = service.addEmployee(emploeeInfoBean);
			if(isAdded) {
				req.setAttribute("msg", "Employee record is added successfully");
			}else {
				req.setAttribute("msg", "Unable to add employee record");
			}
			req.getRequestDispatcher("./addEmployeeJsp").forward(req, resp);
		}else {
			//invalid session
			req.setAttribute("msg", "Please Login first");
			req.getRequestDispatcher("./loginFormJsp").forward(req, resp);
		}
	}

}
