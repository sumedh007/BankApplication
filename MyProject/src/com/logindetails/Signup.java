package com.logindetails;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Signup
 */
@WebServlet("/Signup1")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Signup() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String password = request.getParameter("password");
		String cpassword = request.getParameter("cpassword");

		if (password.equals(cpassword)) {
			Connect c = new Connect();
			Connect c1 = new Connect();
			try {
				Connection conn = c.getConnection();
				PreparedStatement ps = conn.prepareStatement("select * from employee where fname=? and lname=?");
				ps.setString(1, fname);
				ps.setString(2, lname);
				ResultSet rs = ps.executeQuery();
				/*if (rs.next()) {
					System.out.println("Employee Exists");
				}*/
				if (rs.next()) {
					Connection conn1 = c1.getConnection();
					String uname = fname.substring(0, 2) + lname;
					PreparedStatement ps1 = conn1.prepareStatement("insert into login values(?,?);");
					ps1.setString(1, uname);
					ps1.setString(2, password);
					//ps1.execute();
					boolean result=ps1.execute();
					//ResultSet rs1 = ps1.executeUpdate();
					
					System.out.println(ps1.execute());

					if (result) {
						String mess = "User Created Successfully";
						request.setAttribute("mess", mess);
						RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/SignupResponse.jsp");
						dispatcher.forward(request, response);
					}

					else {
						String mess = "Employee does not exist";
						request.setAttribute("mess", mess);
						RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/SignupResponse.jsp");
						dispatcher.forward(request, response);
					}
					conn1.close();
					
				} else {
					String mess = "Passwords Do Not Match";
					request.setAttribute(mess, "mess");
					RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/SignupResponse.jsp");
					dispatcher.forward(request, response);
				}
				
				conn.close();
			}

			catch (Exception e) {
				
				System.out.println(e);
			}

		}
	}

}
