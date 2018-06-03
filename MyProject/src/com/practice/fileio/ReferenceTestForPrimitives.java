package com.practice.fileio;

public class ReferenceTestForPrimitives {
	
	public static void main(String[] args) {
		int number=10;
		System.out.println("Number before modify method = "+ number);
		ReferenceTestForPrimitives rt = new ReferenceTestForPrimitives();
		rt.modifyNumber(number);
		System.out.println("Number after modify method = "+ number);
	}
	public void modifyNumber(int num){
		num+=10;
		System.out.println("Number in modify method = "+ num);		
	}
}
