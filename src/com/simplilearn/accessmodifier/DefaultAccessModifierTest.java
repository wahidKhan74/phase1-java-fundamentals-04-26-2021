package com.simplilearn.accessmodifier;

import com.simplilearn.typecasting.Student;

public class DefaultAccessModifierTest {
	
	
	public static void main(String[] args) {
		
		// create oject
		Brother brother = new Brother();
		
		System.out.println("Money :: "+brother.money);
		System.out.println("Clothes :: "+brother.clothes);
		
		brother.showAll();
		
		// create instance of class with different package.
		// default access modifier can access data from same package.
		Student student = new Student();
		// student.id;  // compile time error
		// student.name;  // compile time error
		// student.printAll();  // compile time error
	}
	
}


class Brother {
	
	// default variable
	double money = 324345.45;
	String clothes ="xyz!";
	
	// default method -> no access modifier
	void showAll() {
		System.out.println(" The Money :: "+money + " Clothes :: " +clothes);
	}
	
	Brother(){ }
}