<%@page import="com.tecgpalle.model.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Student Details</h1>
<%
ArrayList<Student> al=(ArrayList<Student>) request.getAttribute("students"); 
%>
<table border="1">
<%
for(Student s:al)
{
%>
  <tr style="bgcolor=white; color:green; font-size:30px; border:1px solid black font-family=cursive">
  <td><%=s.getSno() %></td>
    <td><%=s.getSname() %></td>
    <td><%=s.getCourse() %></td>
    <td><%=s.getGender() %></td>
    <td><%=s.getEmail() %></td>
    <td><%=s.getEducation() %></td>
    </tr>
    
<%	
}

%>
</table>
</body>
</html>