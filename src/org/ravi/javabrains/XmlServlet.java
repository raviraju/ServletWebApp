package org.ravi.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hello from GET method of XmlServlet");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pWriter = response.getWriter();
		pWriter.println("<h3>XmlServlet</h3>");
	}

}
