package com.simplilearn.datastructure.bigO;

public class LinearTimeComplexity {

	public static void main(String[] args) {

		int[] items = { 11, 20, 33, 40, 55, 66, 77, 88, 99, 110 };  // length as N
		
		displayAll(items);
	}

	// this method : O(n) time complexity  => Linear time complexity
	public static void displayAll(int[] items) {
		
		for (int index = 0; index < items.length; index++) {
			System.out.println(" The inde : "+index +"  and value : "+items[index]);
		}
		
	}
}
