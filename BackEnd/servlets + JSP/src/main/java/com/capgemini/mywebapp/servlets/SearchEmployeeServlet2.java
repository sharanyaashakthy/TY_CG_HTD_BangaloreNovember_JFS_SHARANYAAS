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

@WebServlet("/searchEmployee2")
public class SearchEmployeeServlet2 extends HttpServlet {
	
	private EmployeeService service = new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false); // getting the same session which was already created. Thus,pass "false"
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		
		if(session != null) {
			//valid session
			//Get the form data
			resp.setContentType("text/html");
			out.println("<html>");
			out.println("<body>");
			
			String empIdVal = req.getParameter("empId");
			int empId = Integer.parseInt(empIdVal);            
			EmploeeInfoBean emploeeInfoBean = service.serachEmployee(empId);
			if(emploeeInfoBean != null) {
				out.println("<h3 style='color:green'>Employee ID "+ empId + "Found </h3>");
				out.println("<br>Name = "+emploeeInfoBean.getName());
				out.println("<br>Age = "+emploeeInfoBean.getAge());
				out.println("<br>Designation = "+emploeeInfoBean.getDesignation());
				out.println("<br>Salary= "+emploeeInfoBean.getSalary());
				}else {
					out.println("<h3 style = 'color:red'> Employee ID" + empId +"Not Found" + "</h3>");
					
				}
		}else {
			//invalid session
			out.println("Please Login First");	
			req.getRequestDispatcher("./loginPage.html").include(req, resp);
		}
		out.println("</html>");
		out.println("</body>");
	}//end of doGet()
}//end of class
