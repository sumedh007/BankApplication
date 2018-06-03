package basic;

import java.util.Scanner;

public class Day1Ex3 {
	int i=1;
	int [] remainder= new int [100] ;
	
	public void convertTobinary(int quotient){
		
		while (quotient != 0){
			remainder[i++]=quotient%2;
			quotient=quotient/2;
		}
		for (int j=i; j>0; j--){
			System.out.print(remainder[j]);
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		Day1Ex3 d = new Day1Ex3();
		d.convertTobinary(num);
	
	}
}
