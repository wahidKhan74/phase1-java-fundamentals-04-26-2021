package com.simplilearn.datastructure.search;

public class BinarySearchWithRecursiveTest {

	public static void main(String[] args) {
		

		int[] inputs = { 20, 50, 35, -15, 7, 1, 55, -22 };

		int searchValue = -15;
		int start =0;
		int end = inputs.length -1;
		
		int searchItemIndex = recursiveSearch(inputs, start,end, searchValue);

		if (searchItemIndex > 0) {
			System.out.println("The Search Element " + searchValue + " is found at index " + searchItemIndex);
		} else {
			System.out.println("The element does not exist !");
		}

	}
	
	public static int recursiveSearch(int[] inputs, int start, int end, int value) {
		
		//breaking condition
		if(start>end) {
			return -1;
		}
		
		int middpoint = (start + end) / 2;		
		if (inputs[middpoint] == value) {
			return middpoint;
		}		
		// search in right half
		else if (inputs[middpoint] < value) {
			return recursiveSearch(inputs, middpoint + 1, end , value);
		}		
		// search left halt
		else {
			return recursiveSearch(inputs, start, middpoint-1 , value);
		}
	}

}
