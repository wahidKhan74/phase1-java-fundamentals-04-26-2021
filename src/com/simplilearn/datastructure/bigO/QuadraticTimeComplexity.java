package com.simplilearn.datastructure.bigO;

public class QuadraticTimeComplexity {

	public static void main(String[] args) {

		int[] items = { 11, 20, 33, 40, 55, 66, 77, 88, 99, 110 }; // fix size array with size 10 // N

		displayAllPairs(items);
	}

	// this method run in O(n*n) -> O(n^2) -> Quadratic / Exponential Time
	// Complexity
	private static void displayAllPairs(int[] items) {
		for (int first : items) {
			for (int second : items) {
				System.out.println(first + "  " + second);
			}
		}
	}

	// this method run in O(n*n*n) -> O(n^3) -> Quadratic / Exponential Time
	// Complexity
	private static void displayAllPairsTrice(int[] items) {
		for (int first : items) {
			for (int second : items) {				
				for (int third : items) {
					System.out.println(first + "  " + second +" "+ third);
				}
			}
		}
	}
}
