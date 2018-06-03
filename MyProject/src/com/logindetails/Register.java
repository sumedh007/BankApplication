package com.logindetails;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice.corejava.Employee;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register1")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setFname(request.getParameter("fname"));
		e.setLname(request.getParameter("lname"));
		e.setEmp_id(request.getParameter("eid"));
		e.setEmail(request.getParameter("email"));
		e.setAge(Integer.parseInt(request.getParameter("age")));
		e.setDept(request.getParameter("dept"));
		e.setSal(Integer.parseInt(request.getParameter("sal")));
		e.setPno(Integer.parseInt(request.getParameter("pno")));
		e.setA1(request.getParameter("add1"));
		e.setA2(request.getParameter("add2"));
		e.setCity(request.getParameter("city"));
		
		
		String driver = "com.mysql.jdbc.Driver";
		   String url = "jdbc:mysql://localhost:3306/test_db";
		   String username = "root";
		   String password = "";
		   try {
			Class.forName(driver);
			 Connection conn = DriverManager.getConnection(url,username,password);
			   System.out.println("Connected");
			   PreparedStatement ps = conn.prepareStatement("insert into employee values (?,?,?,?,?,?,?,?,?,?,?)");
				
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
				
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println(e);
		}
		   
		  
		/*EmployeeBO eb = new EmployeeBO();
		try {
			eb.updateEmployee(e);
			System.out.println("successfully registered");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("errrrrorrrrrr:"+e1);
		}*/
		
		
	}

}
