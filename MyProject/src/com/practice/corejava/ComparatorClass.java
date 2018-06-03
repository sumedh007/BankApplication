package com.practice.corejava;

import java.util.Comparator;

public class ComparatorClass implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		int value = 0;
		if (s1.length() == s2.length()) {
			value = s1.compareTo(s2);
		}

		else if (s1.length() < s2.length()) {
			value = -1;
		} else
			value = +1;
		return value;
	}

}
