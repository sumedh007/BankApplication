package com.practice.corejava;

import java.util.TreeSet;

public class ComparatorImplementation {
	
	public static void main(String[] args) {
		TreeSet<StringBuffer> h = new TreeSet<StringBuffer>(new ComparatorClass());
		h.add(new StringBuffer("a"));
		h.add(new StringBuffer("aa"));
		h.add(new StringBuffer("f"));
		h.add(new StringBuffer("aaaa"));
		h.add(new StringBuffer("abcd"));
		
		System.out.println(h);
	}
	
}
