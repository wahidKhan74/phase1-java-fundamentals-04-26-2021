package com.simplilearn.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionTest {

	public static void main(String[] args) {
		
		// checked exceptions : exceptions which are observed at compilation time.

		try {
			FileReader file = new FileReader("file.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
