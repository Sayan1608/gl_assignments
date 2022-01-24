package com.JavaBasics.SwitchCase;

import java.util.Scanner;

public class SwitchCaseChallenge {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the 1st num : ");
		int num1 = in.nextInt();
		System.out.print("Enter the 2nd num : ");
		int num2 = in.nextInt();
		System.out.println("Enter the operation :\n\n1 → addition\n" + "\n" + "2 → subtraction\n" + "\n"
				+ "3 → multiplication\n" + "\n" + "4 → division \n");
		int choice = in.nextInt();

		switch (choice) {
		case 1:
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		case 2:
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		case 3:
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			break;
		case 4:
			if (num2 != 0) {
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			} else {
				System.out.println("Cannot be divided");
			}
			break;
		default:
			System.out.println("Please enter the correct choice!");
		}
	}

}
