package com.simplilearn.datastructure.arrays;

import java.util.Arrays;

public class ArrayRotationsTest {

	public static void main(String[] args) {
		
		int[] items = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		ArrayRotation rotation = new ArrayRotation();
		
		System.out.println(" Before Rotations ");
		System.out.println(Arrays.toString(items));
		
		rotation.rotateLeft(items, 3);
		
		System.out.println(" After Rotations ");
		System.out.println(Arrays.toString(items));
		
	}

}

class ArrayRotation {
	
	// This method runs in O(n+n+n) => O(3n) => O(n)
	public void rotateLeft(int[] items, int pos) {
		
		// create temp array
		int temp[] = new int[pos];
		
		// copy first pos elements
		for (int i = 0; i < pos; i++) {
			temp[i] = items[i];
		}
		
		// move rest of the elements towards left side
		for (int i = pos ; i < items.length; i++) {
			items[i-pos] = items[i];
		}
		
		// copy  the temp elements
		for (int i = 0; i < pos; i++) {
			items[i+items.length-pos] = temp[i];
		}
	}
	
	// rotate array element to right
}
