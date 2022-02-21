/*
 * Demonstrating final keyword
 */
package com.greatlearning.corejava;

public class Area {
	final double pi = 3.14;
	double radius;

	Area(double radius) {
		this.radius = radius;
	}

	public double calculateAreaofAcircle() {
		return pi * radius * radius;
	}

	public static void main(String[] args) {
		Area area = new Area(7);
		System.out.println("Area of Circle::" + area.calculateAreaofAcircle());
	}

}
