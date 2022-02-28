package com.greatlearning.InheritenceDemo;

public class CurrentAccount extends Account{
	
	private int currentBalance;
	
	public CurrentAccount(String customerName, int accountNo, int currentBalance) {
		super(customerName,accountNo);
		this.currentBalance = currentBalance;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Current Balance : "+currentBalance);
	}
}
