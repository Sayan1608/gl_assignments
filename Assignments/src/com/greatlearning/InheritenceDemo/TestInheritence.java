package com.greatlearning.InheritenceDemo;

public class TestInheritence {

	public static void main(String[] args) {
		InheritenceC obj1 = new InheritenceC();

		double circleArea = obj1.circleArea(7);
		System.out.println("Area of circle :" + circleArea);

		double rectangleArea = obj1.rectangleArea(10, 20);
		System.out.println("Area of rectangle :" + rectangleArea);

		double triangleArea = obj1.triangleArea(10, 20);
		System.out.println("Area of triangle :" + triangleArea);

	}

}
