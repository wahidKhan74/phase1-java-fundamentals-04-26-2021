package com.simplilearn.stringhandling;

public class StringImmutableTest {

	public static void main(String[] args) {

		// In java, string objects are immutable.
		// Immutable simply means unmodifiable or unchangeable values.
		
		String username = "John";
		
		// concat() -> update / modify string java ( appends a new text at the end of the string.)
		String response  = username.concat(" Miller");
		
		System.out.println("Old username : "+username);
		System.out.println("New username : "+response);
	}

}
