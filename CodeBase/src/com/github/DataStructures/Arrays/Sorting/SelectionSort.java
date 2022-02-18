package com.github.DataStructures.Arrays.Sorting;

import com.github.Arrays.InputArray;
import com.github.Arrays.PrintArray;
import com.github.Arrays.SwapArrayElements;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = InputArray.input();
		System.out.println("Array before Sorting::");
		PrintArray.printArray(a);
		System.out.println("\nArray after Sorting::");
		selectionSort(a, 0);
		PrintArray.printArray(a);

	}
	
	/*
	 * 
	 * Selection Sort using Recursion mechanism
	 */

	public static void selectionSort(int[] a, int beg) {
		if(beg>=a.length-1) {
			return;
		}
		int low = a[beg];
		int pos = beg;

		for (int i = beg+1; i < a.length; i++) {
			if (low > a[i]) {
				pos = i;
				low = a[pos];
			}
		}
		SwapArrayElements.swap(a, beg, pos);
		selectionSort(a, beg+1);
	}

}
