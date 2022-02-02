package com.github.PatternPrinting;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the height of pyramid2::");
		int height = in.nextInt();
		System.out.println("\n");
//		pyramid1(height);
		pyramid2(height);
		in.close();
	}

	public static void pyramid1(int h) {
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

	public static void pyramid2(int h) {
		for (int i = 1; i <= h; i++) {
			for (int k = h; k > i; k--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
