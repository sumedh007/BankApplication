package org.emailapp;

import java.util.Scanner;

import org.employee.EmployeeBean;
import org.employee.email.EmailBean;
import org.employee.email.EmailGenerator;

public class EmailApp {
	EmployeeBean employeeBean = new EmployeeBean();
	EmailBean emailBean = new EmailBean();
	EmailGenerator emailGenerator = new EmailGenerator();
	
	public static void main(String[] args) {
		EmailApp emailApp = new EmailApp();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name of Employee");
		emailApp.employeeBean.setFname(sc.nextLine());
		
		System.out.println("Enter Last Name of Employee");
		emailApp.employeeBean.setLname(sc.nextLine());
		
		System.out.println("Enter the Department of the Employee");
		emailApp.employeeBean.setDept(sc.nextLine());
		
		System.out.println("Enter the Company of the Employee");
		emailApp.employeeBean.setCompanyname(sc.nextLine());
		
		emailApp.emailBean.setEmployeeBean(emailApp.employeeBean);
		
		emailApp.emailGenerator.setEmailBean(emailApp.emailBean);
		
		emailApp.emailGenerator.generatePassword(10);
		
		emailApp.emailGenerator.generateEmail();
	}
}
