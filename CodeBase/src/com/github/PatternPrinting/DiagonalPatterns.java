package com.github.PatternPrinting;

import java.util.Scanner;

public class DiagonalPatterns {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the height of the pattern::");
		int height = in.nextInt();
		System.out.println("\n");
//		rightDiagonal(height);
		leftDiagonal(height);
		in.close();
	}

	public static void rightDiagonal(int h) {
		for (int i = 1; i <= h; i++) {
			for(int k=1;k<i;k++) {
				System.out.print(" ");
			}
			
			System.out.println("*");
		}
	}
	
	public static void leftDiagonal(int h) {
		for (int i = 1; i <= h; i++) {
			for(int k=h;k>i;k--) {
				System.out.print(" ");
			}
			
			System.out.println("*");
		}
	}
	
	

}
