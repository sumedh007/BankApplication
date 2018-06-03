package com.practice.corejava;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("how many levels do you want?");
		n=sc.nextInt();
		for (int i=0; i<=n;i++){
			System.out.println();
			for (int j=0; j<=i;j++){
				System.out.print("*");
			}
		}
	}
}
