package com.github.PatternPrinting;

import java.util.Scanner;

public class InvertedPyramid {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the height of the inverted pyramid::");
		int height = in.nextInt();
		System.out.println("\n");
		invertedPyramid(height);
		in.close();
	}

	private static void invertedPyramid(int h) {
		for (int i = 1; i <= h; i++) {
			for (int k = 1; k < i; k++) {
				System.out.print(" ");
			}

			for (int j = (((2 * h) - (2 * i - 1))); j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
