package com.practice.fileio;

import com.practice.corejava.Animal;

public class ReferenceTest {
	public static void main(String[] args) {
		
	
	Student student =new Student("sumedh", 80);
	System.out.println("Before modify name = " + student.getName());
	ReferenceTest rt = new ReferenceTest();
	rt.modifyStudentName(student);
	System.out.println("After modify name="+student.getName());
	
}
	public void modifyStudentName(Student student){
		student.setName("Amit");
	}
}
