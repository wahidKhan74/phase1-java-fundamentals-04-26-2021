package com.simplilearn.accessmodifier;

public class PrivateAcessModifierTest {

	public static void main(String[] args) {
		
		// create object 
		Account account = new Account();
		
		account.showAll();
		
		// account.bankMoney;  // compile time error.
		// account.showBalance(); // compile time error.
		// account.showFixDeposit();  // compile time error
	}

}


class Account {
	
	// private variable : properties: data members
	private double bankMoney = 23834.345;
	private double fixDeposit = 34534.34;
	
	// private methods :: member function
	private double showBalance() {
		return bankMoney;
	}
	
	private double showFixDeposit() {
		return fixDeposit;
	}
	
	// public showall method
	public void showAll() {
		System.out.println("The Bank Money " + bankMoney +"  &  fix deposit amount "+fixDeposit);
	}
	
}
