package com.simplilearn.methods;

import java.util.Scanner;

public class DemoCalculator {

	public static void main(String[] args) {

		// step 1: collect user input as numbers -> from console.
		Scanner input = new Scanner(System.in);

		System.out.println("--------------------------------------------");
		System.out.println(" Welcome to Arithmatic Calculator. ");
		System.out.println("--------------------------------------------");
		
		System.out.println(" Enter first number value.");
		int x = input.nextInt();

		System.out.println(" Enter second number value.");
		int y = input.nextInt();
		
		DemoCalculator calc = new DemoCalculator();

		float result1 = calc.add(x, y);
		System.out.println("The Addition " + result1);

		float result2 = calc.sub(x ,y);
		System.out.println("The Substraction " + result2);

		float result3 = calc.mul(x , y);
		System.out.println("The Multiplication " + result3);

		float result4 = calc.div(x ,y);
		System.out.println("The Division " + result4);

		float result5 = calc.avg(x, y);
		System.out.println("The Average " + result5);
	}

	// Arithmetic operations
	public float add(float num1, float num2) {
		return num1 + num2;
	}

	public float sub(float num1, float num2) {
		return num1 - num2;
	}

	public float mul(float num1, float num2) {
		return num1 * num2;
	}

	public float div(float num1, float num2) {
		return num1 / num2;
	}

	public float avg(float num1, float num2) {
		return (num1 + num2) / 2;
	}
}
