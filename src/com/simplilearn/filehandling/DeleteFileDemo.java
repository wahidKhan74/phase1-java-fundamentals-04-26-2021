package com.simplilearn.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DeleteFileDemo {

	public static void main(String[] args) {
		
		String filename = "output2.txt";
		try {
			Files.delete(Paths.get(filename));
			System.out.println("File is deleted !");
		} catch (IOException e) {
			System.out.println("File not found !");
		}
	}

}
