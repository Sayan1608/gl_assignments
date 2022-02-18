package com.github.Arrays;

import java.util.Scanner;

public class InputArray {
	static int[] a;
	static Scanner in = new Scanner(System.in);
	public static int[] input() {
		System.out.print("Enter the size of the array::");
		int n = in.nextInt();
		a = new int[n];
		
		System.out.println("Enter the elements of Array::");
		for(int i=0;i<a.length;i++) {
			a[i]=in.nextInt();
		}
		
		return a;
	}

	
}
