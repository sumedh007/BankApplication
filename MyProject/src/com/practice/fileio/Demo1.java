package com.practice.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		
		//creating directory
		File dir1 = new File("C:/mydir");
		boolean a = dir1.mkdir();
		System.out.println(a);
		
		//creating file in the above directory
		File f1 = new File(dir1, "file1.txt");
		boolean b = f1.createNewFile();
		System.out.println(b);
		
		//adding data to the file
		PrintWriter pw = new PrintWriter(f1);
		pw.println("sample file");
		pw.flush();
		pw.close();
		
		//Printing data on the console
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		System.out.println(s);
	}

}
