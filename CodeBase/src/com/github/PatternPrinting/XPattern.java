package com.github.PatternPrinting;

import java.util.Scanner;

public class XPattern {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the height of the pattern::");
		int height = in.nextInt();
		System.out.println("\n");
		xPattern(height);
	}

	public static void xPattern(int h) {
		Pattern10.invertedPattern10(h);
		for (int i = 1; i < h; i++) {
			for (int k = h - 1; k > i; k--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}

}
