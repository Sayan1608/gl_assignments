package com.github.DataStructures.Arrays.Sorting;

import com.github.Arrays.InputArray;
import com.github.Arrays.PrintArray;

public class MergeSort {
	static int[] a = InputArray.input();
	static int[] temp = new int[a.length];
	

	public static void main(String[] args) {
		System.out.print("Array before Sorting::");
		PrintArray.printArray(a);
		System.out.print("\nArray after Sorting::");
		mergeSort(0,a.length - 1);
		PrintArray.printArray(a);
	}

	public static void mergeSort(int l, int r) {
		if (l < r) {
			int mid = (l + r) / 2;
			mergeSort(l, mid);
			mergeSort(mid + 1, r);
			merge(l, mid, r);
		}
	}

	private static void merge(int l, int mid, int r) {
		int i = l;
		int j = mid + 1;
		int k = l;
		

		while (i <= mid && j <= r) {
			if (a[i] >= a[j]) {
				temp[k++] = a[j++];
			} else {
				temp[k++] = a[i++];
			}
		}

		if (i > mid) {
			while (j <= r) {
				temp[k++] = a[j++];
			}
		} else {
			while (i <= mid) {
				temp[k++] = a[i++];
			}
		}

		for (k = l; k <= r; k++) {
			a[k] = temp[k];
		}
	}

}
