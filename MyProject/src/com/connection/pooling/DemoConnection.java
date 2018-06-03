package com.connection.pooling;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/JDBCDataSourceExample")
public class DemoConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Context ctx = null;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<EmployeeBean> e = new ArrayList<>();

		ConnectionPool c = new ConnectionPool();
		try {

			// Following is the procedure to create a connection pool from line
			// 36 to 39
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/testdb");
			con = ds.getConnection();
			String s = "select * from employee_salary_details";
			PreparedStatement ps = con.prepareStatement(s);
			rs = ps.executeQuery();
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.print("<html><body><h2>Employee Details</h2>");

			while (rs.next()) {
				EmployeeBean eb = new EmployeeBean();
				eb.setName(rs.getString(1));
				eb.setSalary(rs.getInt(2));
				e.add(eb);
			}

			Iterator<EmployeeBean> i1 = e.iterator();
			while(i1.hasNext()){
				EmployeeBean eb1 = i1.next();
				out.println(eb1.getName()+eb1.getSalary());
				out.println("");
			}

		} catch (SQLException | NamingException ex) {
			ex.printStackTrace();
		} finally {
			try {
				rs.close();
				con.close();
				// ctx.close();
			} catch (SQLException sql) {
				System.out.println("Exception in closing DB resources");
			}

		}
	}

}