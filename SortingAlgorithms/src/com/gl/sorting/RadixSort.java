package com.gl.sorting;

import java.util.Arrays;

public class RadixSort {

	public void print(int[] arr) {
		for (int e : arr) {
			System.out.print(e + " ");
		}
	}

	public static void main(String[] args) {

		RadixSort ob = new RadixSort();
		int[] arr = { 121, 432, 564, 23, 1, 45, 788,34};

		System.out.println("Array before sorting :: ");
		ob.print(arr);
		System.out.println("\n\nRadix Sort in progress ::\n ");
		ob.radixSort(arr);
		System.out.println("\nArray after Radix Sort :: ");
		System.out.println();
		ob.print(arr);

	}

	private void radixSort(int[] arr) {

		// find out the maximum element(number)
		int max = greatestNum(arr);
//		System.out.println(max);

		// sort the elements according to the exp position
		for (int exp = 1; (max / exp) > 0; exp *= 10) {
			countSort(arr, exp);
			System.out.println("position -> "+ exp);
			print(arr);
			System.out.println();
		}
	}

	private void countSort(int[] arr, int exp) {

		int[] result = new int[arr.length];
		int[] count = new int[10];
		Arrays.fill(count, 0);

		// fill the occurances of count array based on exp digit's value

		for (int i = 0; i < arr.length; i++) {
			count[(arr[i] / exp) % 10]++;
		}

		// Change count[i] so that count[i] now holds the actual position of this digit
		// in
		// output[]

		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}

		// Build the output array

		for (int i = arr.length - 1; i >= 0; i--) {

			result[count[(arr[i] / exp) % 10] - 1] = arr[i];
			count[(arr[i] / exp) % 10]--;
		}

		// copy the result in original array
		copy(result, arr);

	}

	private void copy(int[] result, int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			arr[i] = result[i];
		}
	}

	private int greatestNum(int[] arr) {
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}
