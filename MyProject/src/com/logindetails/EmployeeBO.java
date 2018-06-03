package com.logindetails;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.practice.corejava.Employee;

public class EmployeeBO{
	public void updateEmployee(Employee e) throws Exception{
		Connect c= new Connect();
		Connection connection = c.getConnection();
		PreparedStatement ps = connection.prepareStatement("insert into employee values (?,?,?,?,?,?,?,?,?,?,?)");
		
		ps.setString(1, e.getFname());
		ps.setString(2,e.getLname() );
		ps.setString(3, e.getEmp_id());
		ps.setString(4, e.getEmail());
		ps.setInt(5, e.getAge());
		ps.setString(6, e.getDept());
		ps.setInt(7, e.getSal());
		ps.setInt(8, e.getPno());
		ps.setString(9, e.getA1());
		ps.setString(10, e.getA2());
		ps.setString(11, e.getCity());
		
		ps.executeUpdate();
		System.out.println("success");
	}
}
