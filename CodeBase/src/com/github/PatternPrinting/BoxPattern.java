package com.github.PatternPrinting;

import java.util.Scanner;

public class BoxPattern {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the height of the box::");
		int height = in.nextInt();
		System.out.println("\n");
		boxPattern(height);
		in.close();
	}

	public static void boxPattern(int h) {
		for(int i=1;i<=h;i++) {
			for(int j=1;j<=h;j++) {
				if((i==1) || (i==h) || (j==1) || (j==h)) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
