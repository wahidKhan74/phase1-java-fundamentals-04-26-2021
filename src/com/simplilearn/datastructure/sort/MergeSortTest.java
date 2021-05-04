package com.simplilearn.datastructure.sort;

import java.awt.Image;
import java.util.Arrays;

public class MergeSortTest {

	public static void main(String[] args) {

		int[] inputs = { 20, 35, -15, 5, 55, 2, -18 };

		System.out.println("Before Merge sort: " + Arrays.toString(inputs));
		
		int start = 0;
		int end = inputs.length;
		mergeSort(inputs,start,end);
		
		System.out.println("After Merge sort: " + Arrays.toString(inputs));

	}

	// mergeSort -> divider of elements
	public static void mergeSort(int[] inputs, int start, int end) {

		// breaking conditions -> recursion
		if(end-start <2) {
			return ;
		}
		
		// 1. divide array elements
		int mid = (start + end) / 2;

		// call mergeSort fort first half
		mergeSort(inputs, start, mid);
		
		// call mergeSort second half
		mergeSort(inputs, mid, end);
		
		// call merge
		merge(inputs, start, mid , end);

	}

	// merge -> swap & combines data 
	private static void merge(int[] inputs, int start , int mid , int end) {
		
		if(inputs[mid-1]<= inputs[mid]) {
			return;
		}
		
		int i = start;
		int j = mid ;
		int tempIndex = 0;
		
		int[] temp = new int[end-start];
		
		while(i< mid && j < end) {
			temp[tempIndex++] = (inputs[i] <= inputs[j] ) ? inputs[i++] : inputs[j++];
		}
		
		// copy element from temp array to actual inputs array
		System.arraycopy(inputs, i, inputs, start+tempIndex, mid-i);
		System.arraycopy(temp, 0, inputs, start, tempIndex);
		
	}
}
