package com.github.DataStructures.Arrays.Sorting;

import com.github.Arrays.InputArray;
import com.github.Arrays.PrintArray;
import com.github.Arrays.SwapArrayElements;

public class BubbleSort {


	public static void main(String[] args) {
		int[] a = InputArray.input();
		System.out.print("Array before Sorting::");
		PrintArray.printArray(a);
		System.out.print("\nArray after Sorting::");
		bubbleSort(a);
		PrintArray.printArray(a);
	}
	
	

	public static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			boolean isSorted = true;
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					isSorted = false;
					SwapArrayElements.swap(a, j, j+1);
				}
			}
			if (isSorted) {
//				System.out.println("Array is sorted in pass::" + (i+1));
				return;
			}
		}
	}



	

}
