package com.simplilearn.regex;

import java.util.regex.Pattern;

public class RegexEaxmples {

	public static void main(String[] args) {
		
		// WA pattern for accepting alphanumeric value  one or more.
		System.out.println(Pattern.matches("[a-zA-Z0-9]+", "johnMike203")); // true.
		 
		// WA pattern for that accepts characters only but up to 10 char.		
		System.out.println(Pattern.matches("[a-zA-Z]{10}", "johnMikeWe"));   //true	
		
		// WA pattern for that accepts alphanumeric only but up to 10 char.
		System.out.println(Pattern.matches("[a-zA-Z0-9]{10}", "johnMike45")); //true
		
		
		// WAP for firstName where only small alphabets allowed  up 2 to 6.
		System.out.println(Pattern.matches("[a-z]{2,6}", "jo")); //true
		System.out.println(Pattern.matches("[a-z]{2,6}", "joh")); //true
		System.out.println(Pattern.matches("[a-z]{2,6}", "johnSmith")); //false
		
		// WAP for email pattern ( small letter , 0 to 9 digit , @ special symbol.)
		System.out.println(Pattern.matches("[a-z0-9]+(.+)@(.+)", "johnsmith21@gmail.com")); //true
		System.out.println(Pattern.matches("[a-z0-9]+(.+)@(.+)", "Johnsmith@gmail.com")); //false
	}

}
