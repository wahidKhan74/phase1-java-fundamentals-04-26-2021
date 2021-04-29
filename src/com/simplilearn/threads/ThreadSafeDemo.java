package com.simplilearn.threads;

// count example
class Counter  {
	
	static int count;
	
	// thread safe methods
	public static synchronized void increaseCount() {
		count++;  // count = count+1;
	}	
	
	// not thread safe.
	public static void decreaseCount() {
		count++;  // count = count+1;
	}	
}

// Thread class
class UserAccount extends Thread {
	
	@Override
	public void run() {		
		for(int i= 1; i<= 1000; i++) {
			Counter.increaseCount();
		}
	}
}


public class ThreadSafeDemo {

	public static void main(String[] args) throws InterruptedException {
		
		UserAccount t1 = new UserAccount();
		UserAccount t2 = new UserAccount();
		UserAccount t3 = new UserAccount();
		
		t1.start();
		/// t1.start();	 // Thread not start 2 times : Exception in thread "main" java.lang.IllegalThreadStateException
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("The Count : "+ Counter.count);

	}

}
