package org.employee;

public class EmployeeBean {
	private String fname;
	private String lname;
	private String dept;
	private int empid;
	private String companyname;
	
	//Default constructor
	public EmployeeBean(){}
	
	//Parameterized Constructor
	public EmployeeBean(String fname, String lname, String dept){
		this.fname =fname;
		this.lname = lname;
		this.dept = dept;
		
		System.out.println("Employee Created");
		
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}

	@Override
	public String toString() {
		return "EmployeeBean [fname=" + fname + ", lname=" + lname + ", dept=" + dept + ", empid=" + empid
				+ ", companyname=" + companyname + "]";
	}
	
	
}
