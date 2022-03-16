package com.gl.searching;

import java.util.Scanner;

public class RecursiveBinarySearch {

	public static void implementationOfRecursiveBinarySearch(int[] arr, int beg, int end, int value) {

		if (beg <= end) {
			int mid = beg + (end - beg) / 2;

			if (arr[mid] == value) {
				System.out.println("Element found at index " + mid);
				return;
			} else if (arr[mid] > value) {
				implementationOfRecursiveBinarySearch(arr, beg, mid - 1, value);
			} else {
				implementationOfRecursiveBinarySearch(arr, mid + 1, end, value);
			}
		} else {
			System.out.println("Number " + value + " is not found in array.");
			return;
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the array size :");
		int n = in.nextInt();

		int[] array = new int[n];

		System.out.println("Please enter the array elements in ascending order :: ");

		for (int i = 0; i < array.length; i++) {
			System.out.print("array[" + i + "] :: ");
			array[i] = in.nextInt();
		}

		System.out.print("Enter the number to be searched :: ");
		int num = in.nextInt();

		implementationOfRecursiveBinarySearch(array, 0, n - 1, num);
		in.close();
	}

}
