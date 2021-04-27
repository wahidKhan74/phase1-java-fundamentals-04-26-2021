package com.simplilearn.stringhandling;

public class StringExample {

	public static void main(String[] args) {
		
		// string literal syntax
		String username1 = "NOAH";
		
		String username2 = "NOAH";  // it does not create a new string.
		
		// Each time you create a string literal, the JVM checks the "string constant pool" first. 
		// If the string already exists in the pool, a reference to the pooled instance is returned.
		// == operator compare reference of the string.
		if(username1 == username2) {
			System.out.println("Same String values.");
		} else {
			System.out.println("Different String values.");
		}
		
		System.out.println("-----------------");
		// string with new keyword
		String name1 = new String("John Smith");
		
		String name2 = new String("John Smith");
		
		// Each Time new keyword is going to generate new string reference.
		if(name1 == name2) {
			System.out.println("Same String values.");
		} else {
			System.out.println("Different String values.");
		}
		

	}

}
