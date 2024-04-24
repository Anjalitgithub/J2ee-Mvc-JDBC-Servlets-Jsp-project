package com.techpalle;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.techpalle.dao.DataAccess;


public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String pw=request.getParameter("pw");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h2>"+email+"</h2>");
		out.println("<h2>"+pw+"</h2>");
		boolean result=DataAccess.checkAdminLogin(email, pw);
		if(result==true) {
			response.sendRedirect("welcome.jsp");
		//out.println("LOGIN SUCCESS");
			
		}
		else {
			out.println("LOGIN FAILURE");
		}
		
		
	}

}
