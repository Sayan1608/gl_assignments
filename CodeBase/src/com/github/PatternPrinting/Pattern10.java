package com.github.PatternPrinting;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the height of the pattern::");
		int height = in.nextInt();
		System.out.println("\n");
		pattern10(height);
		in.close();
	}

	public static void pattern10(int h) {
		for (int i = 1; i <= h; i++) {
			for (int k = h; k > i; k--) {
				System.out.print(" ");
			}
			System.out.print("*");

			for (int j = 1; j <= ((2 * i) - 3); j++) {
				System.out.print(" ");
			}
			if (i > 1) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
