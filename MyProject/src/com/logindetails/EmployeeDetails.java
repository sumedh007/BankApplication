package com.logindetails;

import java.util.ArrayList;

import com.connection.pooling.EmployeeBean;
import com.connection.pooling.EmployeeList;

public class EmployeeDetails {

	public static void main(String[] args) {
		EmployeeList employeeList = new EmployeeList();
		ArrayList<EmployeeBean> e = new ArrayList<>();
		e= employeeList.getEmployeeSalaryList();
		
		System.out.println(e);

	}

}
