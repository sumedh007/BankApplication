package com.practice.fileio;

import java.net.InterfaceAddress;

public class MathImplementer{

	public static void main(String[] args) {
		MathInterface math1 = (a,b)->a+b;
		System.out.println(math1.doMathOperation(10,10));
		
		MathInterface math2 = (a,b)->{
			return (a-b);
		};
		System.out.println(math2.doMathOperation(20, 10));

	}

}
