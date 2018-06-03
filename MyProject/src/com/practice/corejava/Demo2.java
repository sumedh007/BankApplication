package com.practice.corejava;

import java.util.Scanner;

public class Demo2 {
	
	void findDay(int num){
		
		
		switch (num){
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Error: Please enter a number from 1 to 7");
		}
		
	}
	public static void main(String[] args) {
		int i=1;
		Scanner sc = new Scanner(System.in);
		
		while(i!=0){
			System.out.println("enter a number to know the day");
			int n = sc.nextInt();
			Demo2 d = new Demo2();
			d.findDay(n);
			System.out.println("do you want to Exit: press 0");
			i=sc.nextInt();
			}
		

	}

}
