package com.capgemini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/createCookie")
public class CreateCookieServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie myCookie = new Cookie("empName", "Dinga");
		myCookie.setMaxAge(7*24*60*60);//it makes cookies to be persistent in the browser
		resp.addCookie(myCookie);
		
		
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("./cookiePage.html");
		dispatcher.include(req, resp);
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h2>Cookie Created successfully....</h2>");
		out.print("</body>");
		out.print("</html>");
		
	}//end of doGet
	

}//end of class
