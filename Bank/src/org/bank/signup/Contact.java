package org.bank.signup;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.bank.customer.CustomerBO;
import org.bank.customer.CustomerBean;
import org.bank.user.UserBO;
import org.bank.user.UserBean;

/**
 * Servlet implementation class Contact
 */
@WebServlet("/Contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contact() {
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
		boolean n1=false;
		boolean mail=false;
		CustomerBean customerBean= new CustomerBean();
		CustomerBO customerBO = new CustomerBO();
		PrintWriter out= response.getWriter();
		HttpSession session= request.getSession();
		
		UserBean userBean= new UserBean();
		UserBO userBO = new UserBO();
		
		long no1= Long.parseLong(request.getParameter("no1"));
		long no2= Long.parseLong(request.getParameter("no2"));
		String email=request.getParameter("email");
		
		if (no1>1000000000){
			customerBean.setMobileNo(no1);
			n1=true;
		}
		else{
			out.println("Please Enter Mobile number");
		}
		
		if (no1>1000000000){
			customerBean.setOfficeNo(no1);
		}
		else{
			out.println("Please enter valid 10 digit office number");
		}
		
		if (email!=null && email!=""){
			customerBean.setEmail(email);
			mail=true;
		}
		else{
			out.println("Please Enter Email");
			
		}
		
	
		
		customerBean.setAccountNo((Long) session.getAttribute("accountNumber"));
		
		
		
		if(n1==true && mail==true){
			customerBO.InsertContactInformation(customerBean);
			userBean.setAccountNumber(customerBean.getAccountNo());
			userBO.createUser(userBean);
			
			/*RequestDispatcher dispatcher = request.getRequestDispatcher("Contact");
			dispatcher.forward(request, response);*/
		}
	}

}
