package com.greatlearning.InheritenceDemo;

public class AccountDetails extends CurrentAccount {
	private int depositAmount;
	private int withdrawlAmount;

	public AccountDetails(String customerName, int accountNo, int currentBalance, int depositAmoiunt,
			int withdrawlAmount) {

		super(customerName, accountNo, currentBalance);
		this.depositAmount = depositAmoiunt;
		this.withdrawlAmount = withdrawlAmount;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Deposit Amount : " + depositAmount + "\nWithdrawl Amount : " + withdrawlAmount);
	}

}

class TestAccount {
	public static void main(String[] args) {
		AccountDetails obj = new AccountDetails("Sayan Sengupta", 1001, 200000, 50000, 20000);
		obj.display();

	}
}
