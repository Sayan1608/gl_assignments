package com.github.DataStructures.Arrays.Sorting;

import com.github.Arrays.InputArray;
import com.github.Arrays.PrintArray;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a = InputArray.input();
		System.out.print("Array before Sorting::");
		PrintArray.printArray(a);
		System.out.print("\nArray after Sorting::");
		insertionSort(a);
		PrintArray.printArray(a);
	}

	public static void insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int j = i - 1;
			int temp = a[i];
			while (j >= 0 && a[j]>temp) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = temp;
		}
	}

}
