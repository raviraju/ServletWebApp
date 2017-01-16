package org.ravi.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "A simple servlet description", urlPatterns = { "/SimpleServletPath" },
		initParams = {@WebInitParam(name="defaultUser", value = "guest")}
		)
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String userName = request.getParameter("username");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if (userName != "" && userName != null){
			session.setAttribute("savedUserName", userName);
			context.setAttribute("savedUserName", userName);
		}
		PrintWriter pWriter = response.getWriter();
		pWriter.println("<br>Request parameter has username : " + userName);
		pWriter.println("<br>Session parameter has username : " + (String)session.getAttribute("savedUserName"));
		pWriter.println("<br>Context parameter has username : " + (String)context.getAttribute("savedUserName"));
		pWriter.println("<br>Init value : " + this.getServletConfig().getInitParameter("defaultUser"));
		
	}

}
