<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>INSERT STUDENT DETAILS HERE</h1>
<form action="insertStudent" method="post">
sname:<input type="text" name="sname" placeholder="enter the  name"/><br>
course:<input type="text" name="course" placeholder="enter the  course"/><br>
gender:<input type="radio" name="gender" id="male" value="male">male
<input type="radio" name="gender" id="female" value="female">female
<input type="radio" name="gender" id="others" value="others">others
<br>
email:<input type="email" name="email" placeholder="enter the mail"><br>
education:<input type="text" name="education" placeholder="enter the education"><br>
<input type="submit" value="insert student"/>
</form>
</body>
</html>