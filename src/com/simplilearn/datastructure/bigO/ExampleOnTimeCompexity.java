package com.simplilearn.datastructure.bigO;

public class ExampleOnTimeCompexity {

	public static void main(String[] args) {

		int[] items = { 11, 20, 33, 40, 55, 66, 77, 88, 99, 110 };

	}

	// this method runs in O(1 + n + 1 ) = O(2+n) => O(n)
	private static void display(int[] items) {

		System.out.println(items[0]);

		for (int element : items) {
			System.out.println(element);
		}

		System.out.println(items[4]);
	}

	// this method runs in O(1 + n + 1 + n) = O(2+ 2n) => O(n)
	private static void displayTwice(int[] items) {

		System.out.println(items[0]);  // O(1)

		for (int element : items) {     // O(n)
			System.out.println(element);
		}

		System.out.println(items[4]);  // O(1)
		
		int i = 0;
		while (i<items.length) {       // O(n)
			System.out.println(items[i]);
			i++;
		}
	}
}
