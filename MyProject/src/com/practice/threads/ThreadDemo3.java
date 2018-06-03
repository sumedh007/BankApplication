package com.practice.threads;

import java.util.Collections;

public class ThreadDemo3 {
	public static void main(String[] args) {

		Student s = new Student();
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(s);
		Thread t3 = new Thread(s);

		t1.setName("John");
		t2.setName("Tim");
		t3.setName("Lola");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}

class Student implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i < 40; i++) {
			System.out.println("thread name = " + Thread.currentThread().getName() + "Student no = " + i);
			
		}
	}
}