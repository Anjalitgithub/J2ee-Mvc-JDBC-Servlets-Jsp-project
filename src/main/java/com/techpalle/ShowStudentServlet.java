package com.techpalle;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import com.tecgpalle.model.Student;
import com.techpalle.dao.DataAccess;


public class ShowStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ShowStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		ArrayList<Student> al=DataAccess.getStudent();
		request.setAttribute("students", al);
		RequestDispatcher r=request.getRequestDispatcher("show.jsp");
		r.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
