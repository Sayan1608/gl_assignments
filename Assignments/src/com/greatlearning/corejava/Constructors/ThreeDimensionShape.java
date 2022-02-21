package com.greatlearning.corejava.Constructors;

public class ThreeDimensionShape {

	private double width;
	private double height;
	private double depth;

	public ThreeDimensionShape() {
		width = height = depth = 0;
	}

	public ThreeDimensionShape(double width) {
		height = depth = this.width = width;
	}

	public ThreeDimensionShape(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public double volume() {
		return width * height * depth;
	}

	public static void main(String[] args) {
		ThreeDimensionShape s1 = new ThreeDimensionShape(); // calling no-arg constructor
		System.out.println("Volume of shape1 is::" + s1.volume());
		
		ThreeDimensionShape s2 = new ThreeDimensionShape(10.56);
		System.out.println("Volume of shape2 is::" + Math.round(s2.volume()));
		
		ThreeDimensionShape s3 = new ThreeDimensionShape(10, 20, 35);
		System.out.println("Volume of shape3 is::" + Math.round(s3.volume()));
		
	}

}
