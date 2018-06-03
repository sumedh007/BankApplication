package org.studentdao.student;

public class StudentBean {
	private String fname;
	private String lname;
	private int grade;
	private static int id=1000;
	private String uniqueid;
	private int balance = 5000;
	
	public String getUniqueid() {
		return uniqueid;
	}
	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}
	private String coursesEnrolled="";

	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCoursesEnrolled() {
		return coursesEnrolled;
	}
	public void setCoursesEnrolled(String coursesEnrolled) {
		this.coursesEnrolled = coursesEnrolled;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
