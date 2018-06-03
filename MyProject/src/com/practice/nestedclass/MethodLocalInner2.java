package com.practice.nestedclass;

public class MethodLocalInner2 {
	int x = 10;

	public void seeOuter() {

		class MyInner {
			public void showOuter() {
				System.out.println("Outer x value = " + x);
			}
		}

		MyInner in = new MyInner();
		in.showOuter();
	};

	public static void main(String[] args) {
		MethodLocalInner2 inner = new MethodLocalInner2();
		inner.seeOuter();

	}
}
