package com.simplilearn.datastructure.arrays;

import java.util.Arrays;

public class ArrayOserStatisticTest {

	public static void main(String[] args) {

		int items[] = { 7, 10, 4, 3, 20, 15, 65, 80, 99 };

		// order statistics smallest and largest any position

		int result = findKthSmallest(items, 7);
		System.out.println("7th smallest number " + result);
		
		int result2 = findKthLargest(items, 3);
		System.out.println("3rd largest number " + result2);
	}

	public static int findKthSmallest(int[] arr, int kthSmallest) {

		// sort array
		Arrays.sort(arr); // 3 ,4 ,...

		// return kth smallest value.
		return arr[kthSmallest - 1];
	}

	public static int findKthLargest(int[] arr, int kthSmallest) {

		// sort array
		Arrays.sort(arr); // 3 ,4 ,...

		// return kth smallest value.
		return arr[arr.length-kthSmallest];
	}
}
