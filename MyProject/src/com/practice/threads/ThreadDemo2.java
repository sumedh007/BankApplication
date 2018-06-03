package com.practice.threads;

public class ThreadDemo2 implements Runnable {
	public void run() {
		System.out.println("Thread created using Runnable Interface");
		System.out.println("Run by " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		ThreadDemo2 t1 = new ThreadDemo2();
		ThreadDemo2 t2 = new ThreadDemo2();
		ThreadDemo2 t3 = new ThreadDemo2();
		
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		Thread thread3 = new Thread(t3);
		thread1.setName("Thread 1");
		thread2.setName("Thread 2");
		thread3.setName("Thread 3");
		thread1.start();
		thread2.start();
		thread3.start();
		
	}
}
