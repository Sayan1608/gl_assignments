package com.lab2.practice2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Money {

	public static void sort(int[] arr) {

		int partition = 1;

		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] <= temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
//			partition++;
		}
	}

	public static void main(String[] args) throws InvalidDenominatorException {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the number of denominations : ");
		int n = in.nextInt();

		int[] denominations = new int[n];

		Random r = new Random();

		try {
			for (int i = 0; i < denominations.length; i++) {
				if (r.nextInt() != 0) {
					denominations[i] = r.nextInt(101);

				}
			}

			System.out.println(Arrays.toString(denominations));
			sort(denominations);
			System.out.println(Arrays.toString(denominations));

			System.out.print("Enter the amount to pay : ");
			int payAmt = in.nextInt();

			for (int i = 0; i < denominations.length; i++) {
				if (denominations[i] <= payAmt) {
					int num = payAmt / denominations[i];
					payAmt %= denominations[i];
					System.out.println(denominations[i] + ": " + num);
					if (payAmt == 0)
						break;
				}

			}

			if (payAmt > 0) {
				throw new InvalidDenominatorException("Notes of Denomination " + payAmt + " is not available");
			}
		} catch (InvalidDenominatorException e) {
			System.out.println(e.getMessage());
		}

	}

}
