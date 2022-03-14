package com.gl.searching;

import java.util.Scanner;

public class BinarySearch {
	static Scanner in = new Scanner(System.in);
	static int[] arr = null;
	static int size = 0;

	public void implementationOfBinarySearch() {

		System.out.println("Enter the elements of array :: ");

		insertValues();

		System.out.print("Enter the element to be searched :: ");
		final int SEARCH_ELEMENT = in.nextInt();

		searchValue(SEARCH_ELEMENT);

	}

	public void insertValues() {

		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] :: ");
			arr[i] = in.nextInt();
		}
	}

	public void searchValue(int value) {

		int beg = 0;
		int end = size - 1;
		int mid = (beg + end) / 2;

		while (beg <= end) {
			if (arr[mid] == value) {
				System.out.println("Element found at array index :: " + mid);
				return;
			} else if (arr[mid] > value) {
				end = mid - 1;
			} else {
				beg = mid + 1;
			}
			mid = (beg + end) / 2;
		}
		if (beg > end) {
			System.out.println("Element not found.");
		}
	}

	public static void main(String[] args) {

		System.out.print("Enter the no of elements :: ");
		size = in.nextInt();
		arr = new int[size];

		BinarySearch binarySearch = new BinarySearch();

		binarySearch.implementationOfBinarySearch();
	}

}
