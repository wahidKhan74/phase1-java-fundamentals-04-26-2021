package com.simplilearn.datastructure.sort;

import java.util.Arrays;

public class SelectionSortTest {

	public static void main(String[] args) {
		
		int[] inputs = { 20 , 35 , -15 , 5 , 55 , 2, -18 } ;
		
		System.out.println("Before : " + Arrays.toString(inputs));
		selectionSort(inputs);
		System.out.println("After : " + Arrays.toString(inputs));

	}

	// search largest :: largest select.
	// Worst time complexity :  O(n^2)
	private static void selectionSort(int[] inputs) {
		// for loop on unsorted partition
		for(int lastUnsortedIndex = inputs.length-1; lastUnsortedIndex>0; lastUnsortedIndex--) {
			int largest = 0;
			for (int i = 1; i <= lastUnsortedIndex; i++) {
				if (inputs[i] > inputs[largest]) {
					largest = i ;
				}
			}
			swap(inputs, largest, lastUnsortedIndex);
		}
	}
	
	// swap method
	private static void swap(int[] inputs , int i , int j) {
		if(i==j) {
			return ;
		}
		int temp = inputs[i];
		inputs[i] = inputs[j];
		inputs[j] = temp;
	}
	
}
