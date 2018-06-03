package org.studentdao.student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class CreateStudent {

	public static void main(String[] args) {
		
		int entries=0;
		Scanner sc = new Scanner(System.in);
		
		// Ask the student how many students will be added
		System.out.println("Enter the students to be added");
		entries=sc.nextInt();
		ArrayList<StudentBean> student = new ArrayList<>(entries);
		GenerateStudentID generateStudentID = new GenerateStudentID();
		Courses courses = new Courses();
		
		// Ask User to give Data of n number of students
		for(int i=0; i<entries; i++){
			StudentBean s = new StudentBean();
			
			System.out.println("Enter Grade for Student " + " " + i);
			s.setGrade(sc.nextInt());
			
			System.out.println("Enter First Name for Student "+i);
			s.setFname(sc.next());
			
			System.out.println("Enter Last Name for Student "+i);
			s.setLname(sc.next());
			
			generateStudentID.uniqueID(s);
			student.add(s);
			
			//Display List of Courses
			courses.displayCourses();
			courses.selectCourse(s);
		}
		
		//Display list of Students Created
		Iterator<StudentBean> iterator = student.iterator();
		
		while (iterator.hasNext()){
			StudentBean sb = iterator.next();
			System.out.println("name of student " + sb.getFname() + " "+ sb.getLname());
			System.out.println("Id = "+sb.getUniqueid());
			System.out.println("Courses Enrolled " + sb.getCoursesEnrolled());
			System.out.println("Balance = "+sb.getBalance());
			System.out.println("");
		}
	}

}
