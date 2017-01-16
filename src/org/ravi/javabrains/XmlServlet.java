package org.ravi.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String userName = request.getParameter("username");
		PrintWriter pWriter = response.getWriter();
		pWriter.println("Hello from GET method : " + userName);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		String[] courses = request.getParameterValues("courses");
		PrintWriter pWriter = response.getWriter();
		pWriter.println("UserName : " + userName);
		pWriter.println("Password : " + password);
		pWriter.println("You have selected : " + courses.length + " courses");
	}

}
