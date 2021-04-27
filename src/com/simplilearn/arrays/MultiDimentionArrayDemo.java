package com.simplilearn.arrays;

import java.util.Arrays;

public class MultiDimentionArrayDemo {

	public static void main(String[] args) {
		
		// two dimension array
		int [][] numbers = { {2,4,6,8} , {3,5,9} };
		
		System.out.println(Arrays.toString(numbers[0]));
		System.out.println(Arrays.toString(numbers[1]));
		
		System.out.println("---------------------");
		//iterate over tow dimension
		for (int row = 0; row < numbers.length; row++) {
			
			System.out.println("Row : "+Arrays.toString(numbers[row]));
			for (int col = 0; col < numbers[row].length; col++) {

				System.out.println("["+row+","+col+"]" + " = " + numbers[row][col]);				
			}
			
		}
	}
	
	// TODO : WAP for 3 dimensions
}
