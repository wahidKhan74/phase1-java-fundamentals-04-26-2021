package com.simplilearn.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileDemo {

	public static void main(String[] args) {
		
		ReadFileDemo obj = new ReadFileDemo();
		obj.readFile("output.txt");
	}

	//read file
	void readFile(String filename) {
		
		FileInputStream fileIn;
		try {
			int i = 0;
			fileIn = new FileInputStream(filename);
			// System.out.println((char)fileIn.read());
			while((i=fileIn.read()) !=-1) {
				System.out.print((char)i);
			}
			fileIn.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
	}
}
