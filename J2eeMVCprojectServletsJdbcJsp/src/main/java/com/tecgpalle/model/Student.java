package com.tecgpalle.model;

public class Student {
private int sno;
private String sname;
private String course;
private String gender;
private String email;
private String education;
public Student(int sno, String sname, String course,String gender,String email,String education) {
	super();
	this.sno = sno;
	this.sname = sname;
	this.course = course;
	this.gender = gender;
	this.email = email;
	this.education = education;
}
public int getSno() {
	return sno;
}
public void setSno(int sno) {
	this.sno = sno;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getEducation() {
	return education;
}
public void setEducation(String education) {
	this.education = education;
}

}
