package com.simplilearn.datastructure.search;

import java.util.Arrays;

public class ExponentialSearchTest {

	public static void main(String[] args) {
		
		int[] inputs = { -22, -15, -3, -1, 7, 9, 20, 35, 55};

		int searchValue = 9;

		int searchItemIndex = exponentialSearch(inputs, searchValue);

		if (searchItemIndex > 0) {
			System.out.println("The Search Element " + searchValue + " is found at index " + searchItemIndex);
		} else {
			System.out.println("The element does not exist !");
		}
	}
	
	public static int exponentialSearch(int[] inputs, int value) {
		
		// 1. start with 0 index 
		if(inputs[0] ==value) {
			return 0;
		}
		
		// 2. double method to increase range
		int i=1;
		while(i<inputs.length && inputs[i] <= value) {
			i = i*2;
		}
		
		// 3. binary search
		return Arrays.binarySearch(inputs, i/2 , Math.min(i, inputs.length), value);
	}

}
