package com.github.DataStructures.Arrays.Sorting;

import com.github.Arrays.InputArray;
import com.github.Arrays.PrintArray;
import com.github.Arrays.SwapArrayElements;

public class QuickSort {

	static int[] a = InputArray.input();

	public static void main(String[] args) {
		System.out.print("Array before Sorting::");
		PrintArray.printArray(a);
		System.out.print("\nArray after Sorting::");
		quickSort(0, a.length - 1);
		PrintArray.printArray(a);
	}

	public static void quickSort(int l, int h) {
		if (l < h) {
			int pivot = partition(l, h);
			quickSort(l, pivot - 1);
			quickSort(pivot + 1, h);
		}
	}

	public static int partition(int l, int h) {
		int i = l;
		int j = h;
		int key = a[(l+h)/2];
		
		while(i<j) {
			while(a[i]<key)i++;
			while(a[j]>key)j--;
			if(i < j) {
				SwapArrayElements.swap(a, i, j);
			}
		}
		return j;
	}

}
