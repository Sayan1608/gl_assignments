package com.github.NumberPatterns;

import java.util.Scanner;

public class NumPattern1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the height of the pattern::");
		int height = in.nextInt();
		System.out.println("\n");
//		numPattern1(height);
		numPattern2(height);
		in.close();
	}

	private static void numPattern1(int h) {
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	private static void numPattern2(int h) {
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}


}
