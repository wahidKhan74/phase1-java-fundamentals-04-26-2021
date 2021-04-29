package com.simplilearn.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) {
		
		// create object
		Employee employee = new Employee(10001, "John Smith", 98784.34);
		
		try {
			// create output file stream
			FileOutputStream file = new FileOutputStream("file.txt");
			
			// create output object stream
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			// method for serialization 
			out.writeObject(employee);
			
			System.out.println("Serialization is completed !");
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
