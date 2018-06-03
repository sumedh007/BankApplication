package org.studentdao.student;

public class GenerateStudentID {
	public String uniqueID(StudentBean s){
		s.setId(s.getId()+1);
		String c=s.getGrade()+""+s.getId();
		s.setUniqueid(c);
		System.out.println("ID = " + s.getUniqueid());
		return c;
	}
}
