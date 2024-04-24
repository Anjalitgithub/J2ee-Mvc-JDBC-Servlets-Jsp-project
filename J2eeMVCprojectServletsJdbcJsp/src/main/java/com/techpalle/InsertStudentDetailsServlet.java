package com.techpalle;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.techpalle.dao.DataAccess;

//import com.techpalle.dao.DataAccess;


public class InsertStudentDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public InsertStudentDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sname=request.getParameter("sname");
		String course=request.getParameter("course");
		String gender=request.getParameter("gender");
		String email=request.getParameter("email");
		String education=request.getParameter("education");
		
		//response.setContentType("text/html");
		//PrintWriter out=response.getWriter();
		//out.println("<h2>"+sname+"</h2>");
		//out.println("<h2>"+course+"</h2>");
		DataAccess.insertStudent(sname, course,gender,email,education);
	}

}
