package com.simplilearn.typecasting;

import java.util.Scanner;

public class NumericDataConvertor {

	public static void main(String[] args) {
		
		// step 1: collect user input as number -> from console.
		Scanner input = new Scanner(System.in);
		
		System.out.println("--------------------------------------------");
		System.out.println(" Welcome to Numeric Data type Convertor. ");
		System.out.println(" Enter a integer number value.");
		System.out.println("--------------------------------------------");
		
		int userInput = input.nextInt();
		
		// step 2 : convert values into different type.
		
		System.out.println("User Given Input :: "+userInput);
		
		long bigValue = userInput;       // implicit type cast
		float floatValue = userInput ;   // implicit type cast
		double doubleValue = userInput;  // implicit type cast
		
		byte byteValue = (byte) userInput; // explicit type cast
		short shortValue = (short) userInput; // explicit data type cast.
		
		System.out.println("--- Converted value ---");
		System.out.println("Long value :: " + bigValue);
		System.out.println("Float value :: " + floatValue);
		System.out.println("Double value :: " + doubleValue);
		
		System.out.println("Short value :: " + shortValue);
		System.out.println("Byte value :: " + byteValue);
	}

}
