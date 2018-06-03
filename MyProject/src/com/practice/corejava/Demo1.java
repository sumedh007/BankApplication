package com.practice.corejava;

public class Demo1 {

	void determinOddNo(int n){
		boolean flag = false;
		for (int i=2;i<n;i++){
			if(n%i==0){
				flag=true;
			}
		}
		
		if (flag){
			System.out.println(n+" is not an odd no");
		}
		else System.out.println(n+" is an odd no");
		
	}
	
	
	public static void main(String[] args) {
		int num=17;
		Demo1 d = new Demo1();
		d.determinOddNo(num);
		
}
	
}
