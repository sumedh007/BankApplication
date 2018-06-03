package com.practice.fileio;

import java.io.Serializable;

public class Student implements Serializable, Comparable<Student>{
	String name;
	int no;
	StudentStream stream;
	
	public Student(String name, int no){
		this.name = name;
		this.no = no;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Student(String name, int no, StudentStream stream) {
		this.name = name;
		this.no = no;
		this.stream = stream;
	}
	
	public StudentStream getStream(){
		return stream;
	}
	
	public String toString(){
		return (name + no);
	}
	
	@Override
	public int compareTo(Student s){
		return name.compareTo(s.name);
	}
}
