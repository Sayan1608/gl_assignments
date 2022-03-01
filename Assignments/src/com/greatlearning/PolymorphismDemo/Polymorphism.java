package com.greatlearning.PolymorphismDemo;

/*
 * 
 * Compile Time Polymorphism (Method Overloading or Static Binding) demo ...
 */

public class Polymorphism {

	public int findArea(int length, int breadth) { // 1
		return (length * breadth);
	}

	public int findArea(int length, int breadth, int height) { // 2
		return 2 * (length * breadth + breadth * height + height * length);
	}

	public static void main(String[] args) {
		Polymorphism obj = new Polymorphism();

		int recAtrea = obj.findArea(20, 10); // calculates area of rectangle 1 -> will be invoked
		System.out.println("Area of rectangle ::" + recAtrea);

		int cuboidArea = obj.findArea(10, 20, 30);
		System.out.println("Area of cuboid ::" + cuboidArea); // calculates area of cuboid 2 -> will be invoked
	}

}
