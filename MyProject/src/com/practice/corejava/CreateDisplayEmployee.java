package com.practice.corejava;

import java.util.Scanner;

public class CreateDisplayEmployee {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//boolean controlVariable=false;
		//String flag;
		
		CreateEmployee e = new CreateEmployee();
		e.setDetails();
		
		e.displayDetails();
		
		/*System.out.println("Do you want to add another employee (Y/N)?");
		flag=s.next();
		if (flag=="Y"||flag=="y"){
			controlVariable=true;*/
		}
		

	}


