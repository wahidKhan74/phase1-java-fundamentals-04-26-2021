package com.simplilearn.threads;

public class ThreadDemo extends Thread{

	public void run() {
		System.out.println("Thread is runing !");
	}
	
	
	public static void main(String[] args) {
		// create thread
		ThreadDemo thread1 = new ThreadDemo();
		thread1.start();
		
		ThreadDemo thread2 = new ThreadDemo();
		thread2.start();
	}

}
