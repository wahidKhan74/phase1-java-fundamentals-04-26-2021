package com.simplilearn.threads;

public class ThreadDemo3 {
	
	public static void main(String[] args) {
		
		// create thread 
		Johny johny = new Johny(); // object
		
//		johny.show();
		
		Mikey mikey = new Mikey();
		Jowi jowi = new Jowi();
		
		//blocking or time consuming thread
		Thread t1 = new Thread(johny);
		t1.start();
		
		Thread t2 = new Thread(mikey);
		t2.start();
		
		Thread t3 = new Thread(jowi);
		t3.start();
	}
	
	
}

class Account {
	
	public int id;
	String name;
	
	public void show( ) {
		System.out.println("Account Satement.");
	}
	
}


class Johny extends Account implements Runnable {
	// thread logic
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
			System.out.println("Johny , says Hi !");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class Mikey implements Runnable {

	// thread logic
	@Override
	public void run() {
		System.out.println("Mikey , says Hello !");
	}
}

class Jowi implements Runnable {
	
	// thread logic
	@Override
	public void run() {
		System.out.println("Jowi , says Hola !");
	}

}