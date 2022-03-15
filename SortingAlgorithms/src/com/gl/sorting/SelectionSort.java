package com.gl.sorting;

import java.util.Scanner;

public class SelectionSort {

	public int[] array;
	public int temp, size, i, j;
	public boolean status = true;

	Scanner in = new Scanner(System.in);

	public void implementationOfSelectionSort() {

		System.out.print("Enter the no of array elements ::");
		size = in.nextInt();

		array = new int[size];

		System.out.println("Enter the array elements :: ");

		insertValues();

		System.out.println("Array before Selection sort :: ");
		printValues();

		System.out.println("\nExecuting Selection Sort :: \n");

		// Sort values();

		do {

			sortValues();

			status = checkForStatus();

		} while (status == false);

		System.out.println("\nArray after Selection sort :: ");

		printValues();
		in.close();

	}

	public void insertValues() {

		for (int i = 0; i < array.length; i++) {
			System.out.print("array[" + i + "] :: ");
			array[i] = in.nextInt();
		}
	}

	public void sortValues() {
		int index = i;
		for (j = i + 1; j < array.length ; j++) {
			if (array[j] <= array[index]) {
				index = j;
			}
		}
		temp = array[index];
		array[index] = array[i];
		array[i] = temp;
		printValues();
	}

	public void printValues() {

		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public boolean checkForStatus() {

		for (i = 0; i < array.length - 1; i++) {
			if (array[i] >= array[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		SelectionSort selectionSort = new SelectionSort();
		selectionSort.implementationOfSelectionSort();
	}
}
