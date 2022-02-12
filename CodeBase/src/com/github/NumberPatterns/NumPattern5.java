package com.github.NumberPatterns;

import java.util.Scanner;

public class NumPattern5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the height of the pattern::");
		int height = in.nextInt();
		System.out.println("\n");
		numPattern5(height);
		in.close();
	}

	public static void numPattern5(int h) {
		for (int i = 1; i <= h; i++) {
			for (int j = h; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
