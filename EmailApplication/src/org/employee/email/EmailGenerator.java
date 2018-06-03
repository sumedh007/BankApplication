package org.employee.email;

import org.employee.EmployeeBean;

public class EmailGenerator {
	private EmailBean emailBean;

	public EmailBean getEmailBean() {
		return emailBean;
	}

	public void setEmailBean(EmailBean emailBean) {
		this.emailBean = emailBean;
	}

	private EmployeeBean employeeBean;

	// Default Constructor
	public EmailGenerator() {
	}

	// Parameterized Constructor
	public EmailGenerator(EmailBean emailBean) {
		this.emailBean = emailBean;
	}

	public void generateEmail() {
		employeeBean = emailBean.getEmployeeBean();
		String email = employeeBean.getFname() + employeeBean.getLname() + "@" + employeeBean.getDept() + "."
				+ employeeBean.getCompanyname() + ".com";
		emailBean.setEmail(email);
		System.out.println("Email for " + employeeBean.getFname() + " " + employeeBean.getLname()
				+ " Has been successfully generated");
		System.out.println(email);
	}

	public String generatePassword(int length) {
		String passwordString = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890@$*!";
		int charIndex = 0;
		
		String password = "";
		StringBuffer sb = new StringBuffer() ;
		for (int i = 0; i < length; i++) {
			charIndex=(int) (Math.random() * passwordString.length());
			sb.append(passwordString.charAt(charIndex));
			password = sb.toString();

		}
		
		System.out.println(password);
		emailBean.setPassword(password);
		return password;
	}
}
