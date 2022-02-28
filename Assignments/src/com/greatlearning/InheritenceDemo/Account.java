package com.greatlearning.InheritenceDemo;

public class Account {
	private String customerName;
	private int accountNo;

	public Account(String customerName, int accountNo) {
		super();
		this.customerName = customerName;
		this.accountNo = accountNo;
	}

	public void display() {
		System.out.println("Customer Name : " + customerName + "\nAccount No : " + accountNo);
	}

}
