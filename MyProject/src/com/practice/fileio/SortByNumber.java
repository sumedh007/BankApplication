package com.practice.fileio;

import java.util.Comparator;

public class SortByNumber implements Comparator<Student> {
	public int compare(Student s1, Student s2){
		Integer no1 = s1.no;
		Integer no2 = s2.no;
		return no1.compareTo(no2);
	}
}
