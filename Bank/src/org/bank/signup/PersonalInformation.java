package org.bank.signup;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.bank.customer.CustomerBO;
import org.bank.customer.CustomerBean;

import connection.Connect;

/**
 * Servlet implementation class PersonalInformation
 */
@WebServlet("/PersonalInformation")
public class PersonalInformation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PersonalInformation() {
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
		// TODO Auto-generated method stub

		// Get Dob and format it to sql.date datatype
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("AddressInformation.jsp");
		String date = request.getParameter("dob");
		Date dob = null;
		CustomerBO customerBO = new CustomerBO();
		PrintWriter out = response.getWriter();

		boolean firstName = false;
		boolean lastName = false;
		boolean genderValue = false;
		boolean dateofBirth = false;
		try {
			dob = new java.sql.Date(formatter.parse(date).getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Creating a Customer bean
		CustomerBean cb = new CustomerBean();

		if (request.getParameter("fname") != null && request.getParameter("fname") != "") {
			cb.setFname(request.getParameter("fname"));
			firstName = true;
		} else {
			out.println("Please enter first name");
		}
		if (request.getParameter("lname") != null && request.getParameter("lname") != "") {
			cb.setLname(request.getParameter("lname"));
			lastName = true;
		} else {
			out.println("Please enter last name");
		}
		if (request.getParameter("dob") != null && request.getParameter("dob") != "") {
			cb.setDob(dob);
			dateofBirth = true;
		} else {
			out.println("Please enter dob");
		}
		if (request.getParameter("gender") != null && request.getParameter("gender") != "") {
			cb.setGender(request.getParameter("gender"));
			genderValue = true;

		} else {
			out.println("Please enter gender");
		}

		HttpSession session = request.getSession();

		if (firstName == lastName == genderValue == dateofBirth) {
			customerBO.insertPersonalInformation(cb);
			
			// Setting Account number in the session
			if (cb.getAccountNo() != null && cb.getAccountNo() > 0) {
				session.setAttribute("accountNumber", cb.getAccountNo());
				requestDispatcher.forward(request, response);
			}

			//out.println(session.getAttribute("accountNumber"));
		}

	}
}
