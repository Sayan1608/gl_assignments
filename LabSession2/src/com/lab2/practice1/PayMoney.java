package com.lab2.practice1;

import java.util.Scanner;

public class PayMoney {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the number of transactions : ");
		int size = in.nextInt();
		
		int[] transactions = new int[size];
		
		System.out.println("Please enter the value of the transactions : ");
		
		for(int i=0;i<transactions.length;i++) {
			transactions[i] = in.nextInt();
		}
		
		System.out.println("Enter the number of targets that needs to be achieved : ");
		int num_targets = in.nextInt();
		
		
		
		for(int i=0;i<num_targets;i++) {
			System.out.println("Please enter the value of the target : ");
			int target = in.nextInt();
			int sum = 0;
			
			for(int j=0;j<transactions.length;j++) {
				sum += transactions[j];
				
				if(sum >= target) {
					System.out.println("Target achieved after " + (j+1) + " transactions.");
					break;
				}
			}
			
			if(sum < target) {
				System.out.println("Target cannot be achieved");
			}
			
		}
	}
}
