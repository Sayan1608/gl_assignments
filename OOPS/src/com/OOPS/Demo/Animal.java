package com.OOPS.Demo;

import java.util.Scanner;

public class Animal {

	private String color;
	private int age;

	public void initAnimal(String color, int age) {
		this.color = color;
		this.age = age;
	}

	public void displayAnimal() {
		System.out.println(color + " " + age);
	}

	public void eat() {
		System.out.println("I am Eating.");
	}

	public void run() {
		System.out.println("I am Running.");
	}

	public static void main(String[] args) {
		Animal buzo = new Animal();
//		buzo.eat();
//		buzo.run();

//		buzo.age = 10;
//		buzo.color = "black";

		Scanner in = new Scanner(System.in);
		System.out.print("Enter color::");
		String c = in.nextLine();
		System.out.print("Enter age::");
		int a = in.nextInt();
		buzo.initAnimal(c, a);
		buzo.displayAnimal();
	}

}
