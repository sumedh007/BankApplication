package com.practice.fileio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompStud {

	public static void main(String[] args) {
		Student s1 = new Student("amit", 10);
		Student s2 = new Student("manjyot", 20);
		Student s3 = new Student("sumedh", 11);

		ArrayList<Student> students = new ArrayList<Student>();
		students.add(s3);
		students.add(s2);
		students.add(s1);
		
		System.out.println(students);
		
		/*Collections.sort(student);
		
		System.out.println("sorting by name: "+student);
		
		//SortByNumber n = new SortByNumber();
*/		
		Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student student1, Student student2) {
				
				return (student1.name.compareTo(student2.name));
			}
		});
		
		System.out.println("sorting by number:"+students);
		
		students.sort((student1, student2) -> student1.name.compareTo(student2.name));
		

	}
}
