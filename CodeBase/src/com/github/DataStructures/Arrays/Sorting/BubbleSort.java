package com.github.DataStructures.Arrays.Sorting;

import java.util.Scanner;

public class BubbleSort {

	private static Scanner in = new Scanner(System.in);
	private static int[] a;

	public static void main(String[] args) {
		inputArray();
		System.out.print("Array before Sorting::");
		printArray(a);
		System.out.print("\nArray after Sorting::");
		bubbleSort(a);
		printArray(a);
	}
	
	public static void inputArray() {
		System.out.println("Enter no of elemnts::");
		int n = in.nextInt();
		a = new int[n];
		System.out.println("Enter the elements of Array::");
		for(int i=0;i<a.length;i++) {
			a[i]=in.nextInt();
		}
	}

	public static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			boolean isSorted = true;
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					isSorted = false;
					swap(j, j + 1);
				}
			}
			if (isSorted) {
//				System.out.println("Array is sorted in pass::" + (i+1));
				return;
			}
		}
	}

	private static void swap(int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void printArray(int[] a) {
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

}
