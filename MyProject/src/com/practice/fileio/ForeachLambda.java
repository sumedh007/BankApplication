package com.practice.fileio;

import java.util.*;

public class ForeachLambda {
	
	public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("sumedh");
	list.add("rishab");
	list.add("anshul");
	
	list.forEach(
		(i) -> System.out.println(i));
}
}
