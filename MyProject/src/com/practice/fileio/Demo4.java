package com.practice.fileio;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "this is a test string.";
		String [] token = s.split(" ");
		System.out.println("length of token="+token.length);
		for (String i : token){
			System.out.println(i);
			
		}
	}

}
