package com.practice.corejava;

import java.util.Scanner;

public class CreateEmployee {
	Employee e = new Employee();
		public void setDetails(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the employee id of the Employee");
		e.setEmp_id(s.nextLine());
		System.out.println("Enter the name of the Employee");
		e.setName(s.nextLine());
		System.out.println("Enter the dept of the Employee");
		e.setDept(s.nextLine());
		System.out.println("Enter the age of the Employee");
		e.setAge(s.nextInt());
		System.out.println("Enter the salary of the Employee");
		e.setSal(s.nextInt());	
	}
		public void displayDetails(){
			System.out.println("Employee id: "+ e.getEmp_id());
			System.out.println("Employee Name: "+ e.getName());
			
			System.out.println("Employee Department: "+e.getDept() );
			
			System.out.println("Employee Age: "+e.getAge());
			System.out.println("Employee Salary: "+e.getSal());
			
		}
}

