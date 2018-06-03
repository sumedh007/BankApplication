package com.practice.fileio;

import org.apache.xpath.operations.Equals;

class Stud {
	private String name;

	public Stud(String name) {
		this.name = name;
	}

	public String getStudentName() {
		return name;
	}

	public boolean equals(Object o) {
		if ((o instanceof Stud) && ((Stud) o).getStudentName() == this.name) {
			return true;
		} else
			return false;

	}
}

public class EqualTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud s1 = new Stud("sumedh");
		Stud s2 = new Stud("sumedh");

		if (s1.equals(s2)) {
			System.out.println("Two objects are equal");
		} else
			System.out.println("Objects are not equal");

	}

}
