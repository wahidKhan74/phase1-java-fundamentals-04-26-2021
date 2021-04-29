package com.simplilearn.threads;

public class ThreadWithSleep {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread( ()-> {
			System.out.println("Thread t1 !");
		});
		
		Thread t2 = new Thread( ()->{
			System.out.println("Thread t2 !");
		});		
		
		Thread t3 = new Thread( ()->{
			System.out.println("Thread t3 !");
		});
		
		t1.start();
		t3.start();
		
		t2.sleep(3000);
		t2.start();
		
	}

}
