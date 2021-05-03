package com.simplilearn.datastructure.arrays;

public class ArrayDSTest {

	public static void main(String[] args) {
		
		// array ds is a linear ds which store similar element at a index.
		int[] items = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println("Item at index 3 :: "+items[3]);
		
		display(items);
	}

	private static void display(int[] items) {
		
		// iterate with for loop as counter
		for (int index = 0; index < items.length; index++) {
			System.out.println(" The inde : "+index +"  and value : "+items[index]);
		}
		
		// iterate with for loop as enhanced for loop.
		for(int item :items) {
			System.out.println("The value : "+item);
		}
	}
}
