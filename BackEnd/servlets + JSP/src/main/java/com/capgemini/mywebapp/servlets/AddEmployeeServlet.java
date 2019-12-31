package com.capgemini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.mywebapp.bean.EmploeeInfoBean;
import com.capgemini.mywebapp.service.EmployeeService;
import com.capgemini.mywebapp.service.EmployeeServiceImpl;

@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet {
	
	private EmployeeService service =  new EmployeeServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session =  req.getSession(false);
		if(session != null) {
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
				PrintWriter out = resp.getWriter();
				out.println("<html>");
				out.println("<body");
				if(isAdded) {
					out.println("<h3 style='color: green'> Employee added succcessfully </h3>");
				}else {
					out.println("<h3 style='color: red'> Unable to add Employee </h3>");
				}
				out.println("</html>");
				out.println("</body");
				
				req.getRequestDispatcher("./addEmployee").include(req, resp);
				
			}
		}else {
			//invalid session
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h3 style='color: red'>Please login first");
			out.println("</body>");
			out.println("</html>");
			
			req.getRequestDispatcher("./loginPage.html").include(req, resp);
			
		}
	}//end of doPost()
	

}//end of class
