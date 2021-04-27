package com.simplilearn.arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		// an array is a ordered collection of similar type data element
		int numbers[] = { 10, 20,30,40,50,60,70,80,90,100};
		String[] names = { "John", "Mike","Tony","Abdul","Asma"};
		
		System.out.println("Element at index 1 : "+ numbers[1]);
		System.out.println("Element at index 1 : "+ names[1]);
		
		System.out.println("------------------");
		// iterate over an array
		for (int index = 0; index < numbers.length; index++) {
			System.out.println("Element at index : "+index +" value :"+ numbers[index]);
		}
		
		System.out.println("------------------");
		for (int index = 0; index < names.length; index++) {
			System.out.println("Element at index : "+index +" value :"+ names[index]);
		}
		

	}

}
