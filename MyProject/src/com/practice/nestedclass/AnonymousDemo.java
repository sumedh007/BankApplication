package com.practice.nestedclass;

public class AnonymousDemo {
	public static void main(String[] args) {
		
	
	AnonClass1 ac = new AnonClass1() {
		
		@Override
		public String getS() {
			
			return s;
		}
	};
	
	
	System.out.println(ac.getS());
}}

interface AnonClass1{
	String s = "In anonymous inner class";
	public String getS();
}