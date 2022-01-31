package com.github.PatternPrinting;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the height of pyramid::");
		int height = in.nextInt();
		System.out.println("\n");
		pyramid(height);
	}

	public static void pyramid(int h) {
		for (int i = 1; i <= h; i++) {
			for (int k = h; k > i; k--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
