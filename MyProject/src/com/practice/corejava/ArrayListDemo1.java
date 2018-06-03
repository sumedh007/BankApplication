package com.practice.corejava;

import java.util.ArrayList;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(4);
		al.add("sumedh");
		al.add(null);
		al.add(4);
		System.out.println(al);
		al.remove(1);
		al.remove("sumedh");
		al.add(1, "sardal");
		System.out.println(al);
	}
}
