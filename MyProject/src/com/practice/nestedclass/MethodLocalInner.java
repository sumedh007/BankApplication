package com.practice.nestedclass;

public class MethodLocalInner {
	int x = 20;

	public void seeOuter() {
		class MyInner {
			public void printOuter() {
				System.out.println("outer x =" + x);

			}

		}
		MyInner in = new MyInner();
		in.printOuter();
	};

	public static void main(String[] args) {
		MethodLocalInner outer = new MethodLocalInner();
		outer.seeOuter();

	}
}
