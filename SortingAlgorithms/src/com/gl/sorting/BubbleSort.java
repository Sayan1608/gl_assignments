package com.gl.sorting;

import java.util.Scanner;

public class BubbleSort {

	public int array[];

	public int temp, len, i, j;

	public boolean status = true;

	Scanner in = new Scanner(System.in);

	public void implmentationOfBubbleSort() {

		System.out.print("Enter the no of array elements ::");
		len = in.nextInt();
		array = new int[len];

		System.out.println("Enter the array elements :: ");

		// Insert values

		insertValues();

		System.out.println("Array before Bubble sort :: ");
		printValues();

		System.out.println("\nExecuting Bubble Sort :: \n");

		// Sort values();

		do {

			sortValues();

			status = checkForStatus();

		} while (status == false);

		System.out.println("\nArray after Bubble sort :: ");

		printValues();
		in.close();

	}

	public void insertValues() {

		for (int i = 0; i < array.length; i++) {
			System.out.print("array[" + i + "] :: ");
			array[i] = in.nextInt();
		}
	}

	public boolean checkForStatus() { // check if the array is sorted and return boolean value

		for (i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public void sortValues() {

		for (j = 0; j < array.length - i - 1; j++) {
			if (array[j] > array[j + 1]) {
				temp = array[j];
				array[j] = array[j + 1];
				array[j + 1] = temp;
				printValues();
			}
		}

	}

	public void printValues() {

		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

	public static void main(String[] args) {

		BubbleSort bubbleSort = new BubbleSort();

		bubbleSort.implmentationOfBubbleSort();

	}

}
