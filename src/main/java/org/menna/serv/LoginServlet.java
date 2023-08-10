package org.menna.serv;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.menna.serv.service.authentication;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServ")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email , pass;
		email=request.getParameter("email");
		pass=request.getParameter("psw");
		
		authentication ob=new authentication();
		if(ob.auth(email, pass)) {
			response.sendRedirect("home.jsp");
			return;
		}else {
			response.sendRedirect("login.jsp");
			return;
		}
		
	}

}
