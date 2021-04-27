package com.simplilearn.stringhandling;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		// Mutable String with String buffer :: thread safe
		StringBuffer message = new StringBuffer("Today is a good day !");
		
		System.out.println(message);
		
		// update operations on string
		
		// appends new string text at the end of the string.
		message.append(" Happy learning !");
		System.out.println(message);
		
		// replace -> replace text or char  in string.
		message.replace(0, 1, "t");
		System.out.println(message);
		
		// delete -> delete text or char in string
		message.delete(0, 1);
		System.out.println(message);

	}

}
