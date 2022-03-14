package com.gl.searching;

import java.util.Scanner;

public class LinearSearch {

	static Scanner in = new Scanner(System.in);
	static int[] arr = null;
	static int size = 0;

	public void implementationOfLinearSearch() {

		System.out.println("Enter the elements of array :: ");

		insertValues();

//		printValues();

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

	public void printValues() {

		// Your code here...

	}

	public void searchValue(int value) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				System.out.print("Element found at array index :: " + i);
				return;
			}
		}
		System.out.println("Element not found.");
	}

	public static void main(String[] args) {

		System.out.print("Enter the no of elements :: ");
		size = in.nextInt();
		arr = new int[size];

		LinearSearch linearsearch = new LinearSearch();

		linearsearch.implementationOfLinearSearch();

	}

}
