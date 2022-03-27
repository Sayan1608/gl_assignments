package com.practice.problem.gl;

import java.util.Scanner;

public class GoldenRectangle {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter no of rectangles : ");
		int n = in.nextInt();

		int[][] rectangles = new int[n][2];
		double[] ratios = new double[n];

		for (int i = 0; i < rectangles.length; i++) {
			System.out.print("Enter the height of rectangle " + (i + 1) + ": ");
			int height = in.nextInt();

			System.out.print("Enter the width of rectangle " + (i + 1) + ": ");
			int width = in.nextInt();

			if (height >= width) {
				rectangles[i][0] = height;
				rectangles[i][1] = width;
			} else {
				rectangles[i][0] = width;
				rectangles[i][1] = height;
			}

			ratios[i] = ((double) rectangles[i][0] / rectangles[i][1]);
		}

		int count = 0;

		for (double r : ratios) {
//			System.out.println(r);
			if (r >= 1.6 && r <= 1.7) {
				count++;
			}
		}

		System.out.println("No of Golden Rectangles : " + count);

		in.close();
	}

}
