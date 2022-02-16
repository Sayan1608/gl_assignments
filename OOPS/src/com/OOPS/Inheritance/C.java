/*
 * 
 * Showcasing Multi-Level Inheritance Demo
 */
package com.OOPS.Inheritance;

public class C extends B {
	public void showC() {
		System.out.println("C class method.");
	}

	public static void main(String[] args) {
		// accessing through object of class A:

		A a = new A();
		a.showA();

		// accessing through object of class B:

		B b = new B();
		b.showA();
		b.showB();

		// accessing through object of class C:

		C c = new C();
		c.showA();
		c.showB();
		c.showC();

	}
}
