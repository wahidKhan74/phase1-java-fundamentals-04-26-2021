package com.simplilearn.exceptionhandling;

public class ThrowDemo {

	public static void main(String[] args) {
		
		ThrowDemo obj = new ThrowDemo();
//		obj.ageValidator(10);
		obj.dataValidator("");
	}
	
	// age validator
	public void ageValidator(int age) {
		if(age>18) {
			System.out.println("valid age !");
		} else {
			// System.out.println("not valid age !");
			// unchecked exception
			throw new RuntimeException("not valid age !");
		}
	}
	
	
	// age validator
		public void dataValidator(String data) {
			if(data != null && !data.equals("")) {
				System.out.println("valid data !");
			} else {
				throw new RuntimeException("not valide data !");
			}
		}

}
