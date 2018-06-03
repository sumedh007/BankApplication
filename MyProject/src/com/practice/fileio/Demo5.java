package com.practice.fileio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myStuff = new ArrayList<String>();
		myStuff.add("Pencil");
		myStuff.add("Pen");
		myStuff.add("Eraser");
		myStuff.add("Sharpner");
		myStuff.add("Scale");
		myStuff.add("Notebook");
		myStuff.add("Marker");
		
		System.out.println(myStuff.contains("notebook"));
		System.out.println(myStuff.contains("Notebook"));
		System.out.println("Is list empty:"+myStuff.isEmpty());
		System.out.println("Item at index 4:"+myStuff.get(4));
		myStuff.remove(4);
		System.out.println(myStuff);
		Collections.sort(myStuff);
		System.out.println(myStuff);

	}

}
