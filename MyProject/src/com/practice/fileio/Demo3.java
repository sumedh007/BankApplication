package com.practice.fileio;

import java.io.File;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("search");
		String[] files = new String[100];
		files = f1.list();

		for (String s : files) {
			System.out.println("found " + s);

		}

	}
}
