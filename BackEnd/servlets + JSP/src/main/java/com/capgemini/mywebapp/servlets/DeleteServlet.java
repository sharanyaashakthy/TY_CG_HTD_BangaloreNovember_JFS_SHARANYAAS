package com.capgemini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.mywebapp.service.EmployeeService;
import com.capgemini.mywebapp.service.EmployeeServiceImpl;


@WebServlet("/deleteEmployee")
public class DeleteServlet  extends HttpServlet{
	
	private EmployeeService service = new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession(false);
		
		out.println("<html>");
		out.println("<body>");
		if(session != null) {
			//valid session
			int empId = Integer.parseInt(req.getParameter("empId"));
			if(service.deleteEmployee(empId)) {
				out.println("<h2 style='color:red'> Employee record for" + empId + " Deleted");
			}else {
				out.println("<h2 style='color:red'> Employee record for" + empId + " not found");
			}
			out.println("</body>");
			out.println("</html>");
			
			req.getRequestDispatcher("./deleteEmployee.html").include(req, resp);
			
		}else {
			//invalid session
			//PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h2 style='color:red'>Please Login First!");
			out.println("</body>");
			out.println("</html>");
			req.getRequestDispatcher("./loginPage.html").include(req, resp);
			
		}
		
	}//end of doGet()
	

}//end of class
