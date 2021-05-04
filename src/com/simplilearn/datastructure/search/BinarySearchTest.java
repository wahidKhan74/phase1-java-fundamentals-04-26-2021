package com.simplilearn.datastructure.search;

public class BinarySearchTest {

	public static void main(String[] args) {

		int[] inputs = { 20, 50, 35, -15, 7, 1, 55, -22 };

		int searchValue = -105;

		int searchItemIndex = iterativeBinarySearch(inputs, searchValue);

		if (searchItemIndex > 0) {
			System.out.println("The Search Element " + searchValue + " is found at index " + searchItemIndex);
		} else {
			System.out.println("The element does not exist !");
		}
	}

	// binary search : this method runs in logarithmic time complexity O(log n)
	public static int iterativeBinarySearch(int[] inputs, int value) {

		int start = 0;
		int end = inputs.length - 1;

		while (start <= end) {			
			// find midd position
			int middpoint = (start + end) / 2;
			if (inputs[middpoint] == value) {
				return middpoint;
			}
			// search in right half
			else if (inputs[middpoint] < value) {
				start = middpoint + 1;
			}
			// search left halt
			else {
				end = middpoint - 1;
			}
		}
		return -1;
	}

}
