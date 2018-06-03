package com.practice.corejava;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		SquareRoot s = new SquareRoot();
		s.calculateSquareRoot(number);

	}

	public void calculateSquareRoot(int number) {
		int i = 1;
		int counter = 1;
		if (i < number) {
			for (i = 1; i < number; i++) {
				if (number / i == i && number % i == 0) {
					System.out.println("the square root is " + i);

				}
				counter++;
			}

		} else if (counter == number) {
			System.out.println("not a perfect square");
		}
	}
}
