package com.practice.corejava;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int[][] numbers = new int[3][];
		numbers[0] = new int[2];
		numbers[0][0] = 8;
		numbers[0][1] = 8;
		
		numbers[1]=new int[3];
		numbers[1][0] = 5;
		numbers[1][1] = 5;
		numbers[1][2] = 5;
		
		int[] num = {4,3,6};
		
		numbers[2]= num;
		
		for (int i=0;i<numbers.length;i++){
			System.out.println("");
			for (int j=0; j<numbers[i].length;j++  ){
				System.out.print(numbers[i][j]+"  ");
			}
		}
	}

}
