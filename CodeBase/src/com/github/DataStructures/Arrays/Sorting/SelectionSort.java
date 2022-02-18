package com.github.DataStructures.Arrays.Sorting;

import java.util.Scanner;

import com.github.Arrays.InputArray;
import com.github.Arrays.PrintArray;
import com.github.Arrays.SwapArrayElements;

public class SelectionSort {

	public static void main(String[] args) {

		int choice = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Press 1 -> to sort integers::\n2 -> to sort Strings::\n0 -> to exit\nEnter your Choice::");
		choice = in.nextInt();
		switch(choice) {
		case 0:
			System.out.println("exiting...\nexited");
			System.exit(0);
			break;
		case 1:
			int[] a = InputArray.input();
			System.out.println("Array before Sorting::");
			PrintArray.printArray(a);
			System.out.println("\nArray after Sorting::");
			selectionSort(a, 0);
			PrintArray.printArray(a);
			break;
		case 2:
			String[] s = InputArray.inputStringArray();
			System.out.println("Array before Sorting::");
			PrintArray.printArray(s);
			System.out.println("\nArray after Sorting::");
			selectionSort(s, 0);
			PrintArray.printArray(s);
			break;
		default:
			System.out.println("Wrong Choice!");
		}
		

		

	}

	/*
	 * 
	 * Selection Sort using Recursion mechanism
	 */

	// for integer array
	public static void selectionSort(int[] a, int beg) {
		if (beg >= a.length - 1) {
			return;
		}
		int low = a[beg];
		int pos = beg;

		for (int i = beg + 1; i < a.length; i++) {
			if (low > a[i]) {
				pos = i;
				low = a[pos];
			}
		}
		SwapArrayElements.swap(a, beg, pos);
		selectionSort(a, beg + 1);
	}

	// for String Array
	public static void selectionSort(String[] a, int beg) {
		if (beg >= a.length - 1) {
			return;
		}
		String low = a[beg];
		int pos = beg;

		for (int i = beg + 1; i < a.length; i++) {
			if (low.compareToIgnoreCase(a[i]) > 0) {
				pos = i;
				low = a[pos];
			}
		}
		SwapArrayElements.swap(a, beg, pos);
		selectionSort(a, beg + 1);
	}

}
