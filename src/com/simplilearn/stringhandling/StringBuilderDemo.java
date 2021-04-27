package com.simplilearn.stringhandling;

public class StringBuilderDemo {

	public static void main(String[] args) {

		// Mutable String with String Builder :: not thread safe
		StringBuilder message = new StringBuilder("Today is a wonderfull day !");
		System.out.println(message);
		
		//append
		message.append(" Happy eating !");
		System.out.println(message);
		
		// replace 
		message.replace(0, 4, "All");
		System.out.println(message);
		
		// delete -> delete text or char in string
		message.delete(0, 4);
		System.out.println(message);
		
		message.reverse();
		System.out.println(message);
	}
}
