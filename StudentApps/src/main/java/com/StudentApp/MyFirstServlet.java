package com.StudentApp;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Date currentDate=new Date();
		String htmlResponse="<html>"
				+ "   <title>mypage</title>"
				+ "   <body>\r\n"
				+ "       <h1>Today data & time is :"
				+ "          <font color='red'>"+currentDate+"</font>"
				+ "        </h1>"
				+ "   </body>"
				+ "</html>";
		resp.setHeader("refresh", "1");//for each one second it will refresh the page
		resp.setContentType("text/html");//content type of file given
		resp.getWriter().print(htmlResponse);
	}

}
