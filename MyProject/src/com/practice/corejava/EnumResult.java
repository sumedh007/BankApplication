package com.practice.corejava;

import com.practice.corejava.EnumTest.Day;

public class EnumResult {

	public static void main(String[] args) {
		EnumTest test = new EnumTest();
		test.d = Day.SATURDAY;
		System.out.println(test.d);
		test.d = Day.FRIDAY;
		System.out.println(test.d);
		
		for (Day et : Day.values()){
			System.out.println(et+" " +et.getNum());
		}
	}

}
