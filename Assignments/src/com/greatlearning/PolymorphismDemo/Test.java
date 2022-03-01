package com.greatlearning.PolymorphismDemo;

class Test {

	public static void main(String[] args) {
		A obj = new A();
		obj.car(); // calling car() in class A
		
		A obj1 = new B();
		obj1.car(); // overriding car() in class B
	}

}
