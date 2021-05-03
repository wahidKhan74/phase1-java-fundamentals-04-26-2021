package com.simplilearn.datastructure.bigO;

public class ConstantTimeComplexity {

	public static void main(String[] args) {

		// array ds is a linear ds which store similar element at a index.
		int[] items = { 11, 20, 33, 40, 55, 66, 77, 88, 99, 110 };

		// access data : access any value in an array with index constant time
		// complexity O(1)
		System.out.println("Item at index 6 :: " + items[6]); // O(1)

		displayOne(items);
		
		displayTwo(items);
	}

	// search element at index : this method time complexity is O(1)
	public static void displayOne(int[] items) {
		System.out.println(items[0]);
	}

	// search element at index : this method time complexity is O(1)
	public static void displayTwo(int[] items) {
		// O(1 + 1)  // O(2) // O(1)
		System.out.println(items[0]);
		System.out.println(items[5]);
	}

}
