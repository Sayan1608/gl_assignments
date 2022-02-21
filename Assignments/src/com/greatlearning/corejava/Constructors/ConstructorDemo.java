package com.greatlearning.corejava.Constructors;

public class ConstructorDemo {

	public ConstructorDemo() {
		System.out.println("I am default constructor.");
	}

	public ConstructorDemo(int a, float b, String s, char c) {
		System.out.println("I am Parameterized constructor. I take various arguments as input.");
		System.out.println((int) Math.pow(a, 2));
		System.out.println(Math.pow(b, 2));
		System.out.println(s);
		System.out.println(c);
	}

	public void observations() {

		System.out.println("inside Observations method");

	}

	public static void main(String[] args) {
		ConstructorDemo c1 = new ConstructorDemo();
		c1.observations();
		ConstructorDemo c2 = new ConstructorDemo(5, 7.89f, "Sayan", 'A');
		c2.observations();
	}

}
