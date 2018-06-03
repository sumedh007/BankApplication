package com.practice.fileio;

public class ThreadLamda {
	public static void main(String[] args) {
	Runnable r1 = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("in the first thread");
		}
	};
	
	Runnable r2 = ()-> {
		System.out.println("in the second thread");
	};
	
	
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}
}
