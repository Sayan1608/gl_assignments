package com.github.NumberPatterns;

import java.util.Scanner;

public class NumPattern7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the height of the pattern::");
		int height = in.nextInt();
		System.out.print("Enter the length of the pattern::");
		int length = in.nextInt();
		System.out.println("\n");
		numPattern7(height, length);
		in.close();
	}

	// level -> difficult
	public static void numPattern7(int h, int l) {
		int no = -l;
		for (int i = 1; i <= h; i++) {
			no = no + l;
			for (int j = 1; j <= l; j++) {
				if (i % 2 != 0) {
					System.out.print(++no + " ");
				} else {

					System.out.print(no-- + " ");
				}
			}
			System.out.println();
		}
	}

}
