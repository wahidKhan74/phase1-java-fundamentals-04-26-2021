package com.simplilearn.datastructure.sort;

import java.util.Arrays;

public class InsertionSortTest {

	public static void main(String[] args) {
		
		int[] inputs = { 20, 35, -15, 5, 55, 2, -18 ,-99};

		System.out.println("Before : " + Arrays.toString(inputs));
		insertionSort(inputs);
		System.out.println("After : " + Arrays.toString(inputs));

	}

	public static void insertionSort(int[] inputs) {
		
		for (int firstUnsortedIndex = 1; firstUnsortedIndex < inputs.length; firstUnsortedIndex++) {
			
			int element = inputs[firstUnsortedIndex];
			int i ;
			for (i = firstUnsortedIndex; i > 0 && inputs[i-1] > element; i--) {
				inputs[i] = inputs[i-1];
			}
			inputs[i] = element;
		}
		
	}

}
