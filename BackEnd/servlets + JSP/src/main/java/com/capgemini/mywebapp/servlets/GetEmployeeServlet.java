package com.capgemini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//*******rqmt***********
//http://localhost:8080/mywebapp/getEmployee?id=101


public class GetEmployeeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		    //get the query String
			String idVal =  req.getParameter("id");
			
			//Get the context param
			ServletContext context = getServletContext();
			String contextParamVal = context.getInitParameter("myContextParam");
			
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.print("<html>");
			out.print("<body>");
			out.print("Employee id = "+idVal);
			out.print("<br>Employee name = Dinga");
			out.print("<br>Employee salaray = 400000");
			
			out.println("<br><br> Context Param Value = "+contextParamVal);
			out.print("</body>");
			out.print("</html>");
	}//end of doget
	
	

}//end of class
