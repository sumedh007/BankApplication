package com.connection.pooling;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;


public class EmployeeList {
	ConnectionPool connectionPool = new ConnectionPool();
	DataSource ds = connectionPool.getConnection();
	Connection conn = null;

	public ArrayList<EmployeeBean> getEmployeeSalaryList(){
	Statement stmt;
	ArrayList<EmployeeBean> employeeBean = new ArrayList<EmployeeBean>();
	try {
		conn=(Connection) ds.getConnection();
		stmt = (Statement) conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from employee_salary_details");
		
	
	while (rs.next()){
		EmployeeBean e = new EmployeeBean();
		e.setName(rs.getString(1));
		e.setSalary(rs.getInt(2));
		
		employeeBean.add(e);
		
	}
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return employeeBean;
	
}
}