package com.simplilearn.exceptionhandling;

public class ExceptionWithMethods {

	int balance = 20000;
	
	public static void main(String[] args) {
		
		ExceptionWithMethods obj = new ExceptionWithMethods();
		
//		obj.transaction(0);
//		obj.withdraw(1000);
//		obj.deposit(100);
//		obj.nameLenghtCalcutor("John Smith");
//		obj.nameLenghtCalcutor(null);
		
		//correct o/p
		obj.multiTask(1231,"123");
		obj.multiTask(0,"123");
		obj.multiTask(123,"123abc");
		obj.multiTask(123,null);
	}
	
	public void transaction(int amount) {
		try {
			balance = balance/ amount; 
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException Occurs !");
		}
		
	}
	
	public void withdraw(int amount) {
		try {
			if(amount < balance && amount > 0)
				balance -= amount; 
			System.out.println("Withdraw Complete "+balance);
		} catch (Exception e) {
			System.out.println("Exception Occurs !");
		}		
	}
	
	public void deposit(int amount) {
		try {
			if( amount > 0)
				balance += amount; 
			System.out.println("Deposit Complete "+balance);
		} catch (Exception e) {
			System.out.println("Exception Occurs !");
		}	
	}
	
	public void nameLenghtCalcutor(String name) {
		try {
			int length = name.length();
			System.out.println("The Name length "+length);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException Occurs !");
		}
		
	}
	
	public void multiTask(int number, String str) {
		
		try {
			
			int respose = balance / number;
			int result  = str.length();
			int output = Integer.parseInt(str);
			
			System.out.println(" respose "+respose);
			System.out.println(" result "+result);
			System.out.println(" output "+output);
			
		} catch (ArithmeticException e) {
			System.out.println("Exception Ocuurs :: " + e.getClass());
			System.out.println("Exception Message :: " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Exception Ocuurs :: " + e.getClass());
			System.out.println("Exception Message :: " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Exception Ocuurs :: " + e.getClass());
			System.out.println("Exception Message :: " + e.getMessage());
		}
		
		
	}

}
