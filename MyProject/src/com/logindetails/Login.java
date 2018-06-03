package com.logindetails;
import java.sql.*; 
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uname, upass;
		uname =	request.getParameter("Uname");
		upass = request.getParameter("Upass");
		
		try{
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/test_db";
			String username = "root";
			String password = "";
			Class.forName(driver);

			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
			PreparedStatement ps = conn.prepareStatement("select * from login where username=? and password=?");
			ps.setString(1, uname);
			ps.setString(2, upass);
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				String mess = "Welcome ";
				mess = mess.concat(uname);
				request.setAttribute("mess", mess);
				// request.setAttribute("uname", uname);
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Welcome.jsp");
				dispatcher.forward(request, response);
			} else {
				request.setAttribute("mess", "Error!!!");
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Error.jsp");
				dispatcher.forward(request, response);
			}
			conn.close();
		}
			catch (Exception e2) 
			{
				System.out.println(e2);
				}
		
	}
}
