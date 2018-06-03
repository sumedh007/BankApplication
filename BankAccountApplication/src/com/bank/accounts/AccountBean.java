package com.bank.accounts;

public class AccountBean {
	private String name;
	private int ssn;
	String accountType;
	private int initialBalance;
	private static int unique5 = 00001;
	private long accountNumber;

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getInitialBalance() {
		return initialBalance;
	}

	public void setInitialBalance(int initialBalance) {
		this.initialBalance = initialBalance;
	}

	public String separator = "--------------------------";

	

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		System.out.println("Name: " + getName());
		System.out.println("SSN: " + getSsn());
		System.out.println("Account type: " + getAccountType());
		System.out.println("Initial Balance: " + getInitialBalance());
		System.out.println("Account Number: " + getAccountNumber());
		return separator;
	}

}