package com.simplilearn.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationTest {

	public static void main(String[] args) {
		
		try {
			// create file input stream
			FileInputStream file  = new FileInputStream("file.txt");
			
			//create object inout strea
			ObjectInputStream in = new ObjectInputStream(file);
			
			// method for de-seralization.
			Employee emp = (Employee)in.readObject();
			
			System.out.println("----- Employee Deserialized object ---");
			System.out.println(" Employee Id :: "+emp.id);
			System.out.println(" Employee Name :: "+emp.name);
			System.out.println(" Employee Salary :: "+emp.slary);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
