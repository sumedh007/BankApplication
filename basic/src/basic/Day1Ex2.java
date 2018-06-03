package basic;

import java.util.Scanner;

public class Day1Ex2 {
	
	
	public void printTable(int n){
		for (int i=1; i<=10; i++){
			System.out.println(n + " * "+i+" = " + (n*i));
		}
	}
	
	public static void main(String[] args) {
		int number;
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		number=sc.nextInt();
		
		Day1Ex2 d = new Day1Ex2();
		d.printTable(number);
	}
}
