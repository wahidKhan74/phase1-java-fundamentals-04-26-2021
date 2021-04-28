package com.simplilearn.regex;

import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches(".m", "Ym")); // true-> first char can be any value but 2nd char should be m
		System.out.println(Pattern.matches(".m", "YmYm"));  // false -> length more than 2 char not allowed
		System.out.println(Pattern.matches(".m", "Yk"));  // false
		System.out.println(Pattern.matches("..m", "YKm"));  // true -> first tow char anything third should be m.
		System.out.println(Pattern.matches("m..", "mYK"));  // true -> first as m then two char anything 
		System.out.println(Pattern.matches(".m.", "YmK"));  // true
		
		System.out.println(Pattern.matches("[xyz]", "x"));  // true
		System.out.println(Pattern.matches("[xyz]", "abc"));  //false
		System.out.println(Pattern.matches("[xyz]", "xyz"));  //false  (one match value) 
		System.out.println(Pattern.matches("[xyz]", "xyzxxxzz"));  //false  (one match value) 
		
		System.out.println(Pattern.matches("[xyz]?", "x"));  // x y and z are allowed only one time. true (one match value) 
		System.out.println(Pattern.matches("[xyz]?", "xxx"));  // false (one match value).
		
		System.out.println(Pattern.matches("[xyz]+", "y"));  // true (one or more than one match value).
		System.out.println(Pattern.matches("[xyz]+", "yy"));  // true 
		
		
		System.out.println(Pattern.matches("[a-z]+", "abcxyz"));  // true  (any data from a -z small)
		System.out.println(Pattern.matches("[a-z]+", "abcXyz"));  // false
		
		System.out.println(Pattern.matches("[A-Z]+", "ABCPQR"));  // true  (any data from A -Z caps)
		System.out.println(Pattern.matches("[A-Z]+", "xABCPQR"));  // false  
		
		System.out.println(Pattern.matches("[a-zA-Z]+", "abcxyzABCPQR"));  //true  combine a-zA-Z
		System.out.println(Pattern.matches("[0-9]+", "9"));   // true
		System.out.println(Pattern.matches("[0-9]+", "92"));   // true		
		//username
		System.out.println(Pattern.matches("[a-zA-Z0-9]+", "wahidKhan74"));  // true
		
		System.out.println("----------------");
		System.out.println(Pattern.matches("\\d", "mkns")); // false => digit only
		System.out.println(Pattern.matches("\\d", "8")); // true => digit only
		System.out.println(Pattern.matches("\\D", "P")); // true => not digit only
		
		
		
		
		
		
		
	} 

}
