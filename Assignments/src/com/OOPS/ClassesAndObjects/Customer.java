package com.OOPS.ClassesAndObjects;

public class Customer {
	String fullName;
	int age;

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.fullName = "Sayan Sengupta";
		customer1.age = 25;
		
		Customer customer2 = new Customer();
		customer2.fullName = "Anjan Dutta";
		customer2.age = 70;
		
		System.out.println("customer1 :: " + customer1.fullName +" "+customer1.age);
		System.out.println("customer2 :: " + customer2.fullName +" "+customer2.age);
	}

}
