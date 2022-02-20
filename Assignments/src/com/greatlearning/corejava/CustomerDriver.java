package com.greatlearning.corejava;

public class CustomerDriver {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		System.out.println(c1.customerFullName); // public member -> accessible everywhere
//		System.out.println(c1.age); private member -> not accessible outside class definition
		System.out.println(c1.totalPurchase);// protected member -> not accessible outside non-package & non-sub class
		c1.displayCustomerDetails();
	}

}
