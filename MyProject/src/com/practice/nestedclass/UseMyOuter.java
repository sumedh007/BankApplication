package com.practice.nestedclass;

import com.practice.nestedclass.MyOuter.MyInner;

public class UseMyOuter {
	public static void main(String[] args) {
		MyInner in = new MyOuter().new MyInner();
		
		in.seeInner();
	}
}
