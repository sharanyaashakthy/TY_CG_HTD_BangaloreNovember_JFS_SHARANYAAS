package com.capgemini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readCookie")
public class ReadCookieServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//get the cookies
		Cookie[] Cookies = req.getCookies();
		resp.setContentType("text/html");
		PrintWriter out  = resp.getWriter();
		
		req.getRequestDispatcher("./cookiePage.html").include(req, resp);
		
		out.println("<html>");
		out.println("<body>");
		if(Cookies!=null) {
			for (Cookie cookie : Cookies) {
				out.println("Cookie name = "+cookie.getName());
				out.println("<br>Cookie value = "+cookie.getValue());
			}
		}else {
			System.err.println("<br>Cookies are not found");
		}
		out.println("</body>");
		out.println("</html>");
		
	}//end of doGet

}//end of Class
