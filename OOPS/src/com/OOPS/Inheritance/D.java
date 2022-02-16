/*
 * 
 * Showcasing Hierachial Inheritance Demo::
 */
package com.OOPS.Inheritance;

public class D extends A{

	public void showD() {
		System.out.println("D class method.");
	}
	public static void main(String[] args) {
		// accessing through object of class A:
		
		A a = new A();
		a.showA();
		
		// accessing through object of class B:
		B b = new B();
		b.showA();
		b.showB();
		
		// accessing through object of class D:
		
		D d = new D();
		d.showA();
		d.showD();
	}

}
