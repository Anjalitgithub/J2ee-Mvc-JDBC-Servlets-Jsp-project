package com.techpalle.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.tecgpalle.model.Student;

public class DataAccess {
	public static ArrayList<Student> getStudent(){
		ArrayList<Student> al=new ArrayList<Student>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/j2eeproject","root","AnjuRanju@8431");
			Statement s=con.createStatement();
			 ResultSet res=s.executeQuery("select * from student");
			 if(res!=null) {
				 while(res.next()==true) {
					 int sno=res.getInt(1);
					 String sname=res.getString(2);
					 String course=res.getString(3);
					 String gender=res.getString(4);
					 String email=res.getString(5);
					 String education=res.getString(6);
					 Student obj=new Student(sno,sname,course,gender,email,education);
					 al.add(obj);
			 }
		 }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
		
	}
	
	public static void insertStudent(String sname,String course,String gender,String email,String education) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/j2eeproject","root","AnjuRanju@8431");
			PreparedStatement s=con.prepareStatement("insert into student(sname,course,gender,email,education) values(?,?,?,?,?)");
			s.setString(1, sname);
			s.setString(2, course);
			s.setString(3, gender);
			s.setString(4, email);
			s.setString(5, education);
			s.executeUpdate();
			s.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
public static boolean  checkAdminLogin(String email,String pw) {
	//JDBC CODE read all rows from admin table
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/j2eeproject", "root","AnjuRanju@8431");
		Statement s=con.createStatement();
		ResultSet res=s.executeQuery("select * from admin");
		int count=0;
		if(res!=null) {
			while(res.next()==true) {
				String dbemail=res.getString(2);
				String dbpw=res.getString(3);
				if(dbemail.equals(email)&& dbpw.equals(pw)) {
				
					count++;
					break;
				}
			}
		}
		s.close();
		con.close();
		if(count==1) 
			return true;
		else
			return false;
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return false;
	
}
}
