package com.greatlearning.corejava;

public class Customer {
	public String customerFullName = "Sayan Sengupta";
	private int age = 25;
	protected double totalPurchase = 216000.99;
	
	public void displayCustomerDetails() {
		System.out.println("Full Name::"+customerFullName);
		System.out.println("age::"+age);
		System.out.println("Total Purchase Amount::"+age);
	}
}
