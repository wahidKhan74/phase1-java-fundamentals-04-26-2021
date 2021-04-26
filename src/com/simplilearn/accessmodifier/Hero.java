package com.simplilearn.accessmodifier;

public class Hero {

	// protected variable 
	protected int rank = 01 ;
	protected String power = " Healing Power :: Wolworeen !";
	
	// protected methods 
	protected void showPower() {
		System.out.println(" The hero power is "+ power);
	}
	
	public void showRank() {
		System.out.println(" The rank is : "+rank);
	}
}
