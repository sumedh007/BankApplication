package com.practice.corejava;

public class Horse extends Animal{
	static void eat(){
		System.out.println("Specialized Method for eat");
	}
	
	public void sleep(){
		System.out.println("Horse is sleeping");
	}
	
	public static void main(String[] args) {
		Animal a1 = new Horse();
		Animal a2 = new Animal();
		Horse a3 = new Horse();
		a1.eat();
		a2.eat();
		a3.eat();
		//a1.sleep();// the reference is of animal and object is of horse, 
					 //animal does not have access to horse method
		
		
	}
}

