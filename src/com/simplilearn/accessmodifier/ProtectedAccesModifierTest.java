package com.simplilearn.accessmodifier;

import com.simplilearn.accessB.Emplopyee;

public class ProtectedAccesModifierTest extends Emplopyee {

	public static void main(String[] args) {
		
		// create object
		// protected properties belong same package.
		Hero hero = new Hero();
		
		System.out.println(hero.power);
		System.out.println( hero.rank);
		
		hero.showPower();
		hero.showRank();
		
		System.out.println("------------------------------------");
		
		// class outside the package  
		// protected properties 
		Emplopyee emplopyee = new Emplopyee();
		
		// emplopyee.rank  // compile time error.
		// employee.salary // compile time error.
		// emplopyee.showRank();
		
		ProtectedAccesModifierTest test = new ProtectedAccesModifierTest();
		System.out.println("The Emp salary :: "+test.salary);
		System.out.println("The Emp Rank :: "+test.rank);
		test.showSalary();
	}

}

