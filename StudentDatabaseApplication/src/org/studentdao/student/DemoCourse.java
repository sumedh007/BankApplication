package org.studentdao.student;

public class DemoCourse {
	public static void main(String[] args) {
		Courses c = new Courses();
		StudentBean s = new StudentBean();
		c.displayCourses();
		c.selectCourse(s);
		System.out.println(s.getCoursesEnrolled());
	}
}
