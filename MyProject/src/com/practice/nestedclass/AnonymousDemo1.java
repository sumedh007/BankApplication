package com.practice.nestedclass;

public class AnonymousDemo1 {
	public static void main(String[] args) {
		
		InnerMethod in = new InnerMethod();
		in.displayRuns(new Runs(){

			@Override
			public void getRuns() {
				System.out.println("Runs scored = " + runs);
				
			}
			
		});
		
		
	}
}

	interface Runs {
		int runs = 100;

		public void getRuns();
	}

class InnerMethod{
	
	public void displayRuns(Runs runs){}
}