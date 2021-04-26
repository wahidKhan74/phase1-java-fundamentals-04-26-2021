package com.simplilearn.accessmodifier;

public class PublicAccessModifierTest {

	public static void main(String[] args) {
		
		//create object
		Govn govn = new Govn();
		
		System.out.println("The Public Money ::" + govn.publicMoney);
		System.out.println("The Public park ::" + govn.park);
		
		System.out.println(govn.showPublicMoney());
		System.out.println(govn.showPark());
		
		
	}
}


class Govn {
	
	// public variable
	public double publicMoney = 223843.34;
	public String park = "MCIT Park";
	
	// public methods
	public double showPublicMoney() {
		return publicMoney;
	}
	
	public String showPark() {
		return park;
	}
	
}