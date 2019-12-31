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

import sun.print.resources.serviceui;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	private EmployeeService service = new EmployeeServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1.Get the form data
		String empIdVal = req.getParameter("empId");
		String password = req.getParameter("password");
		
		int empId = Integer.parseInt(empIdVal);
		
		//validating
		EmploeeInfoBean emploeeInfoBean = service.authenticate(empId, password);
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		if(emploeeInfoBean!=null) {
			//valid credentials
			//1.Create a new session
			HttpSession session = req.getSession(true); //always pass true for creating a new session
			
			//2.place all the user info in this session, by using attributes(pass the info)
			session.setAttribute("emploeeInfoBean", emploeeInfoBean);
			out.println("<h2 style='color:blue'>Welcome "+emploeeInfoBean.getName() + "!</h2>");
			out.println("<br> <a href='./addEmployee.html'>Add Employee </a>");
			out.println("<br> <a href='#'>Update Employee </a>");
			out.println("<br> <a href='./searchEmployeeForm.html'>Search Employee </a>");
			out.println("<br> <a href='./deleteEmployee.html'>Delete Employee </a>");
			out.println("<br> <a href='#'>See All Employee </a>");
			out.println("<br><br> <a href='./logout'>Log out </a>");
			
			
		}else {
			//Invalid credentials
			out.println("<h3 style = 'color:red'>Invalid credentials </h3>");
			req.getRequestDispatcher("./loginPage.html").include(req, resp);
		}
		out.println("</body>");
		out.println("</html>");
		
		
	}// end of doPost()
	

}//end of class
