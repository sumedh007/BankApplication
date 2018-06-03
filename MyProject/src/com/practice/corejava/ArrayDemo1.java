package com.practice.corejava;

public class ArrayDemo1 {
	public static void main(String[] args) {
		int[] price = new int[5];
		price[0] = 10;
		price[1] = 20;
		price[2] = 30;
		price[3] = 40;
		price[4] = 50;

		for (int a = 0; a < price.length; a++) {
			System.out.println("Price of " + a + " " + price[a]);
		}

		int i = 0;
		for (int a : price) {

			System.out.println("Price of element " + i + " " + a);
			i++;
		}
	}
}
