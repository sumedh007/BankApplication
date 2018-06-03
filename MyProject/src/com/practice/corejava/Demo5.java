package com.practice.corejava;

public class Demo5 {
	String a="acegi";
	String b="bdfhj";
	String c="";
	
	public static void main(String[] args) {
		Demo5 d= new Demo5();
		d.merge();
	}
	void merge(){
		for (int i=0;i<a.length();i++)
		{
			c=c+a.charAt(i);
			c=c+b.charAt(i);
			
	}
		System.out.println(c);
}
}
