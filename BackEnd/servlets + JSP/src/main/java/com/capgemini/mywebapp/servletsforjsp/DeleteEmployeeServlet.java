package com.capgemini.mywebapp.servletsforjsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.capgemini.mywebapp.service.EmployeeService;
import com.capgemini.mywebapp.service.EmployeeServiceImpl;

@WebServlet("/deleteEmployee2")
public class DeleteEmployeeServlet extends HttpServlet {
	private EmployeeService service = new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session != null) {
			//valid session
			int empId = Integer.parseInt(req.getParameter("empId"));
			boolean isDeleted = service.deleteEmployee(empId);
			if(isDeleted) {
				req.setAttribute("msg", "Employee Id " +empId + "deleted successfully");
			}else {
				req.setAttribute("msg", "Unable to delete the employee details for empId "+empId);
			}
			
			req.getRequestDispatcher("./deleteEmployeeJsp").forward(req, resp);
			
		}else {
			//invalid session
			req.setAttribute("msg", "Please Login First");
			req.getRequestDispatcher("./loginFormJsp").forward(req, resp);
			
		}
	}

}
