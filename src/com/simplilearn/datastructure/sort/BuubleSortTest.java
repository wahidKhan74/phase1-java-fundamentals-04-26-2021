package com.simplilearn.datastructure.sort;

import java.util.Arrays;

public class BuubleSortTest {

	public static void main(String[] args) {

		int[] inputs = { 20, 35, -15, 5, 55, 2, -18 };

		System.out.println("Before : " + Arrays.toString(inputs));
		bubbleSort(inputs);
		System.out.println("After : " + Arrays.toString(inputs));

	}

	// bubble sort
	// Worst time complexity :  O(n^2)
	public static void bubbleSort(int[] inputs) {
		// Iterate over unsorted
		for (int lastUnsortedIndex = inputs.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex; i++) {
				// compare two adjacent element.
				if (inputs[i] > inputs[i + 1]) {
					swap(inputs, i, i + 1);
				}
			}
		}

	}

	// swap method
	private static void swap(int[] inputs, int i, int j) {
		if (i == j) {
			return;
		}
		int temp = inputs[i];
		inputs[i] = inputs[j];
		inputs[j] = temp;
	}
}
