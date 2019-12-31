package com.capgemini.mywebapp.servletsforjsp;

import java.io.IOException;
import java.util.List;

import javax.print.attribute.standard.Severity;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.mywebapp.bean.EmploeeInfoBean;
import com.capgemini.mywebapp.service.EmployeeService;
import com.capgemini.mywebapp.service.EmployeeServiceImpl;

@WebServlet("/seeAllEmployees")
public class SeeAllEmployeesServlet extends HttpServlet {
	private EmployeeService service = new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session != null) {
			//valid session
			List<EmploeeInfoBean> emploeeInfoList = service.getAllEmployees();
			if(emploeeInfoList != null && !emploeeInfoList.isEmpty()) {
				req.setAttribute("emploeeInfoList", emploeeInfoList);
				
			}else {
				req.setAttribute("msg", "There is no Employee records to display");
			}
			req.getRequestDispatcher("./seeAllEmployeesJsp.jsp").forward(req, resp);
			
		}else {
			//invalid session
			req.setAttribute("msg", "Please Login first");
			req.getRequestDispatcher("./loginFormJsp").forward(req, resp);
		}
	}

}
