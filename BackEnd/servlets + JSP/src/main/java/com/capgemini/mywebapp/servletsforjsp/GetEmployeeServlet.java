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
@WebServlet("/searchEmployee3")
public class GetEmployeeServlet extends HttpServlet{
	private EmployeeService service = new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session != null) {
			//valid session
			int empId=Integer.parseInt(req.getParameter("empId"));
			EmploeeInfoBean emploeeInfoBean = service.serachEmployee(empId);
			
			req.setAttribute("emploeeInfoBean", emploeeInfoBean);
			req.getRequestDispatcher("./searchEmployeeJsp.jsp").forward(req, resp);
			
		}else {
			//invalid session
			req.setAttribute("msg", "Please Login First");
			req.getRequestDispatcher("./loginFormJsp").forward(req, resp);
		}
		
	}//End of doGet()

}//End of Class
