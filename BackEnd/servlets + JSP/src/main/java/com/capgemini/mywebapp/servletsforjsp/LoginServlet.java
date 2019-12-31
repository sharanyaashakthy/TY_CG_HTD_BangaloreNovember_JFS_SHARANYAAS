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

@WebServlet("/login2")
public class LoginServlet extends HttpServlet {
	private EmployeeService service = new EmployeeServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//get the form data
		int empId = Integer.parseInt(req.getParameter("empId"));
		String password = req.getParameter("password");
		
		EmploeeInfoBean emploeeInfoBean = service.authenticate(empId, password);
		if(emploeeInfoBean != null) {
			//valid credential
			HttpSession session = req.getSession(true);
			session.setAttribute("emploeeInfoBean", emploeeInfoBean);
			
			//for automatically logging out like for banking application
			session.setMaxInactiveInterval(60);
			
			req.getRequestDispatcher("./homePageJsp.jsp").forward(req, resp);
			
		}else {
			//invalid credential
			req.setAttribute("msg", "Invalid credentials");
			req.getRequestDispatcher("./loginForm").forward(req, resp);
			
		}
		
		
		
		
	}//End of doPost()
	

}//End of class
