package com.simplilearn.threads;

class AccountCustomer {

	double balance = 2000.234;

	synchronized void withdraw(int amount) {
		if (balance < amount) {
			System.out.println("Less Balance ! ");
			try {
				wait();
			} catch (Exception e) {
			}

		}
		balance -= amount;
		System.out.println("Withdraw complete ! " + balance);
	}

	synchronized void deposit(int amount) {
		System.out.println("Going to deposit ...");
		balance += amount;
		System.out.println("Deposit Complete ! " + balance);
		// initiate /resume blocking thread.
		notify();
	}

}

public class ThreadWithWaitTest {

	public static void main(String[] args) {

		AccountCustomer c = new AccountCustomer();

		Thread t1 = new Thread(() -> {
			c.withdraw(3000);

		});
		t1.start();

		Thread t2 = new Thread(() -> {
			c.deposit(5000);
		});
		t2.start();

	}

}
