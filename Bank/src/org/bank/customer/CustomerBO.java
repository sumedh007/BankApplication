package org.bank.customer;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import connection.Connect;

public class CustomerBO {
	
	//Method to get account number & insert data in personal_information
	public void insertPersonalInformation(CustomerBean cb) {
		Connect c = new Connect();
		Connection connection = c.getConnection();
		System.out.println("Connected");

		PreparedStatement ps2;
		//Get the last account no from db
		try {
			ps2 = connection.prepareStatement("select max(account_no) from personal_information;");
			ResultSet rs1 = ps2.executeQuery();

			if (rs1.next()) {
				cb.setAccountNo(rs1.getLong(1)+1);
				cb.getAccountNo();
				
				if (cb.getAccountNo()>10001){
					System.out.println(cb.getAccountNo());	
				}
				
				else{
					cb.setAccountNo((long)10001);
				}
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String s = "insert into personal_information(account_no,fname,lname,dob,gender) values(?,?,?,?,?);";
		try {
			PreparedStatement ps = connection.prepareStatement(s);
			ps.setLong(1, cb.getAccountNo());
			ps.setString(2, cb.getFname());
			ps.setString(3, cb.getLname());
			ps.setDate(4, (Date) cb.getDob());
			ps.setString(5, cb.getGender());
			int x = ps.executeUpdate();
			System.out.println(x);
			ps.close();
			connection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	//Insert Address in Database
	public void insertAddressInformation(CustomerBean cb) {
		String query="";
		Connect c = new Connect();
		Connection connection = c.getConnection();
		System.out.println("Connected");
		
		query="insert into addressinformation (addressline1,addressline2,city,state,zipcode,accountnumber) values(?,?,?,?,?,?);";
		
		
		try {
			PreparedStatement preparedStatement1 =  connection.prepareStatement(query);
			preparedStatement1.setString(1, cb.getAddressLine1());
			preparedStatement1.setString(2, cb.getAddressLine2());
			preparedStatement1.setString(3, cb.getCity());
			preparedStatement1.setString(4, cb.getState());
			preparedStatement1.setInt(5, cb.getZip());
			preparedStatement1.setLong(6,cb.getAccountNo());
			int x = preparedStatement1.executeUpdate();
			preparedStatement1.close();
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	//Insert Contact Information in Database
	public void InsertContactInformation(CustomerBean cb) {
		String query="";
		Connect c = new Connect();
		Connection connection = c.getConnection();
		System.out.println("Connected");
		
		query="insert into contactinformation (account_no,mobile_no,office_no,email) values(?,?,?,?);";
		try {
			PreparedStatement ps= connection.prepareStatement(query);
			ps.setLong(1, cb.getAccountNo());
			ps.setLong(2, cb.getMobileNo());
			ps.setLong(3, cb.getMobileNo());
			ps.setString(4, cb.getEmail());
			System.out.println(ps.executeUpdate());
			ps.close();
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
