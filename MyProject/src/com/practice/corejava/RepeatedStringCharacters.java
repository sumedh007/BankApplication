package com.practice.corejava;

public class RepeatedStringCharacters {
	public static void main(String[] args) {
		String inputString = "gurukrupa";

		for (int i = 0; i < inputString.length(); i++) {
			char c = inputString.charAt(i);
			int jsetter = i+1;
			for (int j = jsetter; j < inputString.length(); j++) {
				char d = inputString.charAt(j);
				if (c == d) {
					System.out.println(c);
				}
			}
		}
	}
}
