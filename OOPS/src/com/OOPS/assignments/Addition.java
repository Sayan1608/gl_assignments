package com.OOPS.assignments;

import java.util.Scanner;

public class Addition {

	public int performAddition(int num1, int num2) {
		return (num1 + num2);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter the first number: ");
		int num1 = in.nextInt();

		System.out.print("Please enter the second number: ");
		int num2 = in.nextInt();

		Addition add = new Addition();

		System.out
				.println("Addition of two numbers " + num1 + " and " + num2 + " is " + add.performAddition(num1, num2));
	}

}
