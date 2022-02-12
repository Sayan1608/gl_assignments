package com.github.NumberPatterns;

import java.util.Scanner;

public class NumPattern6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the height of the pattern::");
		int height = in.nextInt();
		System.out.println("\n");
		numPattern6(height);
		in.close();
	}

	// level -> difficult
	public static void numPattern6(int h) {
		for (int i = 1; i <= h; i++) {
			int no = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(no + " ");
				no += h - j;
			}
			System.out.println();
		}
	}

}
