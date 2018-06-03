package com.practice.nestedclass;

public class MyOuter {
	public int outerX = 30;

	class MyInner {

		public void seeInner() {
			System.out.println("Outer x = " + outerX);
			System.out.println("inner class reference = " + this);
			System.out.println("outer class reference = " + MyOuter.this);
		}

	}
	
	
	public static void main(String[] args) {
		
		
		MyInner in = new MyOuter().new MyInner();
		in.seeInner();
	}
}
