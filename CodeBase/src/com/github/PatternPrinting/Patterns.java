package com.github.PatternPrinting;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the height of Pattern3::");
		int height = in.nextInt();
		System.out.println("\n\n");
//		pattern1(height);
//		pattern2(height);
		pattern3(height);
	}

	public static void pattern1(int h) {
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern2(int h) {
		for (int i = 1; i <= h; i++) {
			for (int j = h; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern3(int h) {
		pattern1(h);
		pattern2(h-1);
	}
}
