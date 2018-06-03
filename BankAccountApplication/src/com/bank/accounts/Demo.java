package com.bank.accounts;

public class Demo {
	static int no = 00001;
	public static void main(String[] args) {
		int random = (int) (Math.random() * 1000 - 1);
		String s = String.valueOf(no) + String.valueOf(random);
		System.out.println(s);

	}

}
