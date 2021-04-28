package com.simplilearn.threads;

public class ThreadDemo2 {
	
	public static void main(String[] args) {		
		// create thread 
		John t1 = new John();
		t1.start();
		
		Mike t2 = new Mike();
		t2.start();
		
		
		Joe t3 = new Joe();
		t3.start();
		
	}
	
	
}

class John extends Thread {
	// thread logic
	public void run() {
		try {
			sleep(3000);
			System.out.println("John , says Hi !");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class Mike extends Thread {

	// thread logic
	public void run() {
		System.out.println("Mike , says Hello !");
	}
}

class Joe extends Thread {

	// thread logic
	public void run() {
		System.out.println("Joe , says Hola !");
	}

}