package com.simplilearn.exceptionhandling;

import java.io.IOException;

public class ThrowsDemo {

	public static void main(String[] args) {

		ThrowsDemo obj = new ThrowsDemo();

		try {
			obj.ageValidator(20);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			obj.dataValidator("John");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// age validator
	public void ageValidator(int age) throws IOException {
		if (age > 18) {
			System.out.println("valid age !");
		} else {
			// checked exception
			throw new IOException("not valid age !");
		}
	}

	// age validator
	public void dataValidator(String data) throws Exception {
		if (data != null && !data.equals("")) {
			System.out.println("valid data !");
		} else {
			throw new Exception("not valide data !");
		}
	}

}
