package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) {
		
		CreateNewFile obj =  new CreateNewFile();
		
		obj.createFile("output.txt");
		
		obj.createFile2("output2.txt");
	}
	
	// create file using File cLass
	public void createFile(String filename) {	
		
		try {
			
			File file  = new File(filename);
			if(file.createNewFile()) {
				System.out.println("File is created !");
			} else {
				System.out.println("File already exist !");
			}
			
			// Write  Content to file : character stream
			FileWriter writer = new FileWriter(file);
			writer.write("Test data to file inserted !");
			writer.close();
			
		} catch (IOException e) {
			System.out.println("File Creation Failed !");
		}		
	}
	
	//create file using FileOutputStream : insert data as byte stream
	public void createFile2 (String filename) {
		
		try {
			
			String data = "Sample text data into file! ";
			FileOutputStream out = new FileOutputStream(filename);
			out.write(data.getBytes());
			out.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File Creation Failed !");
		} catch (IOException e) {
			System.out.println("File Write Operation Failed !");
		}
	}
}
