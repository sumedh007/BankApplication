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

/**
 * Servlet implementation class Address
 */
@WebServlet("/Address")
public class Address extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Address() {
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
		HttpSession session= request.getSession();
		CustomerBean cb= new CustomerBean();
		PrintWriter out= response.getWriter();
		
		boolean ad1= false;
		boolean ad2= false;
		boolean c= false;
		boolean s= false;
		boolean z= false;
		boolean acc= false;
		
		CustomerBO customerBO= new CustomerBO();
		
		long accNo= (long) session.getAttribute("accountNumber");
		
		String add1=request.getParameter("add1");
		String add2=request.getParameter("add2");
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		int zip= Integer.parseInt(request.getParameter("zip"));
		
		
		
		if (add1!=null && add1!=""){
			cb.setAddressLine1(add1);
			ad1=true;
		}
		else{
			out.println("Please enter address line 1");
		}
		
		if (add2!=null && add2!=""){
			cb.setAddressLine2(add2);
			ad2=true;
		}
		else{
			out.println("Please enter address line 2");
		}
		
		if (add2!=null && add2!=""){
			cb.setCity(city);
			c=true;
		}
		else{
			out.println("Please enter city");
		}
		
		if (state!=null && state!=""){
			cb.setState(state);
			s=true;
		}
		else{
			out.println("Please enter address line 1");
		}if (zip>100000){
			cb.setZip(zip);
		}
		else{
			out.println("Please enter valid zip address");
		}
		if (accNo>0){
			cb.setAccountNo(accNo);
			acc=true;
		}
		
		if (ad1==ad2==c==s==acc){
			customerBO.insertAddressInformation(cb);
			RequestDispatcher dispatcher= request.getRequestDispatcher("ContactInformation.jsp");
			dispatcher.forward(request, response);
		}
		
		
	}
	
		

}
