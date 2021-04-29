package com.simplilearn.exceptionhandling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		System.out.println("Program Initiated !");
		try {

			int balance = 20000;
			int response = balance / 10;
			System.out.println(response);	
			
		} catch (Exception e) {
			System.out.println("Exception has Occured !");
		} finally {
			System.out.println("Finally always esecute !");
		}
		
		System.out.println("Program completed !");
		

	}

}
