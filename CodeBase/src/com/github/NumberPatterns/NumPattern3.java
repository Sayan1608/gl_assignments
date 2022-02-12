package com.github.NumberPatterns;

import java.util.Scanner;

public class NumPattern3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the height of the pattern::");
		int height = in.nextInt();
		System.out.println("\n");
		numPattern3(height);
		in.close();
	}

	public static void numPattern3(int h) {
		for (int i = 1; i <= h; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
