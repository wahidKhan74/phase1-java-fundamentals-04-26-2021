package com.simplilearn.methods;

public class MethodsExample {

	// main methods
	public static void main(String[] args) {

		// static method call : with class reference
		MethodsExample.showGreetings();
		MethodsExample.displayData("John Smith", 30);
		boolean response = MethodsExample.isAutherised(false);
		System.out.println("The Response "+response);
		// MethodsExample.displayData("Tony Stark", 50);
		
		System.out.println("-----------------------------");

		// non static : call by using objects
		MethodsExample example = new MethodsExample();
		example.showMessage();
		example.showData("Mike Gill", 78);
		boolean result = example.isActive(true);
		System.out.println("The Active result "+result);
		
	}

	// syntax
	// accessModifier static/nonStatic returnType methodName ( parameters ) { ---
	// method body --- }

	// zero parameter method
	// non static
	public void showMessage() {
		System.out.println("Welocme to Java methods !");
	}

	// static method
	public static void showGreetings() {
		System.out.println("Hello, Welocme to Java methods !");
		return ;
	}

	// non static => Parameterized method
	public void showData(String name, int age) {
		System.out.println("Hello user , " + name + "  you age " + age);
	}

	// static  => Parameterized method
	public static void displayData(String name, int age) {
		System.out.println("Hi user , " + name + "  you age " + age);
	}
	
	public boolean isActive(boolean active) {
		return active;
	}
	
	public static boolean isAutherised(boolean auth) {
		return auth;
	}

}
