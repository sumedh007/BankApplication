package com.practice.corejava;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("how many levels do you want?");
		n=sc.nextInt();
		
		int i, j, k=2*n-2;
		
		for (i=0;i<n;i++){
			
			for (j=0; j<k;j++){
				System.out.print(" ");
			}
			k=k-2;
			for (j=0; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
			}
		}

	}


