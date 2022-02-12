package com.github.NumberPatterns;

import java.util.Scanner;

public class NumPattern4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the height of the pattern::");
		int height = in.nextInt();
		System.out.println("\n");
		numPattern4(height);
		in.close();
	}

	public static void numPattern4(int h) {
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

}
