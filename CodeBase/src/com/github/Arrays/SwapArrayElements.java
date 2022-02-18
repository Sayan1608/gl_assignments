package com.github.Arrays;

public class SwapArrayElements {
	
	public static void swap(int[]a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void swap(String[]a, int i, int j) {
		String temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
