package com.practice.nestedclass;

class AnonClass {
	
	public void keepRunning() {}

}

	public class AnonimousInnerClassImplementer{
		public static void main(String[] args) {
			
			AnonClass ac = new AnonClass(){
			@Override
			public void keepRunning() {
				System.out.println("Inside anonymous implementation class");
			}
		};
		
		ac.keepRunning();
		}
	}