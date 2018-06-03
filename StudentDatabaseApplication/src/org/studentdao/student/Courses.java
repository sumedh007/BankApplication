package org.studentdao.student;

import java.util.Scanner;

public class Courses {
	public void displayCourses(){
		System.out.println("List of Courses");
		System.out.println("1. History 101");
		System.out.println("2. Maths 101");
		System.out.println("3. English 101");
		System.out.println("4. Chemistry 101");
		System.out.println("5. Computer Science 101");
		System.out.println("0. Exit");
	}
	
	public void selectCourse(StudentBean sb){
		System.out.println("Enter your Choice");
		int ch=0;
		Scanner sc = new Scanner(System.in);
		ch=sc.nextInt();
		switch(ch){
		case 1:
			if (sb.getBalance()>0){
			sb.setCoursesEnrolled(sb.getCoursesEnrolled()+"History 101");
			sb.setBalance(sb.getBalance()-600);
			break;
			}
			
		case 2:
			if (sb.getBalance()>0){
			sb.setCoursesEnrolled(sb.getCoursesEnrolled()+" Maths 101");
			sb.setBalance(sb.getBalance()-600);
			break;
			}
			
		case 3:
			if (sb.getBalance()>0){
			sb.setCoursesEnrolled(sb.getCoursesEnrolled()+"English 101");
			sb.setBalance(sb.getBalance()-600);
			break;
			}
			
		case 4:
			if (sb.getBalance()>0){
			sb.setCoursesEnrolled(sb.getCoursesEnrolled()+" Chemistry 101");
			sb.setBalance(sb.getBalance()-600);
			break;
			}
			
		case 5:
			if (sb.getBalance()>0){
			sb.setCoursesEnrolled(sb.getCoursesEnrolled()+" Computer Science 101");
			sb.setBalance(sb.getBalance()-600);
			break;
			}
			
		case 0:
			break;
			
		default:
			System.out.println("Please Enter Correct Choice");
			selectCourse(sb);
		}
	}
}
