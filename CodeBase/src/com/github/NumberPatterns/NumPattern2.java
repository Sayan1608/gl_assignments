package com.github.NumberPatterns;

import java.util.Scanner;

public class NumPattern2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the height of the pattern::");
		int height = in.nextInt();
		System.out.println("\n");

		numPattern2(height);
		in.close();
	}

	public static void numPattern2(int h) {
		int count = 1;

		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}

	}

}
