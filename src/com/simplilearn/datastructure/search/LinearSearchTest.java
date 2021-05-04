package com.simplilearn.datastructure.search;

public class LinearSearchTest {

	
	public static void main(String[] args) {
		
		int[] inputs = { 20 ,50 , 35,-15, 7 ,1 , 55, -22 };
		
		int searchValue = 955;
		
		int searchItemIndex = linearSearch(inputs, searchValue);
		
		if(searchItemIndex>0) {
			System.out.println("The Search Element "+searchValue + " is found at index "+searchItemIndex);
		} else {
			System.out.println("The element does not exist !");
		}
		

	}
	
	//linear search  : time complexity O(n)
	public static int linearSearch(int[] items, int value) {
		
		// search through an complete array
		for (int index = 0; index < items.length; index++) {
			if(items[index]==value) {
				return index;
			}
		}		
		return -1;
	}

}
