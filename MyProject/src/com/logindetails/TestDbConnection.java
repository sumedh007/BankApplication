package com.logindetails;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.mysql.jdbc.Connection;
import javax.sql.DataSource;
import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class TestDbConnection
 */
@WebServlet("/TestDbConnection")
public class TestDbConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TestDbConnection() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		InitialContext initialContext;
		Context context;
		try {
			initialContext = new InitialContext();
			context = (Context) initialContext.lookup("java:comp/env");
			DataSource dataSource = (DataSource) context.lookup("connpool");
			Connection connection = (Connection) dataSource.getConnection();
			if (connection == null) {
				System.out.println("Error !!!");
			}

			else {
				System.out.println("connected");
			}

			String query = "SELECT * FROM employee_salary_details";

			PreparedStatement statement = (PreparedStatement) connection.prepareStatement(query);
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				System.out.println("Name = " + rs.getString(0));
			}
		} catch (NamingException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

}
