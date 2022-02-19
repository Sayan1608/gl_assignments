package com.OOPS.CompileTimePolymorphism;
/*
 * 
 * Compile Time Polymorphism is achieved through Method Overloading
 * 
 * condns for method overloading:
 * 1)No of arg.
 * 2)Seq. of args.
 * 3)Type of args.
 * 
 * Showcased Automatic Promotion rule:
 */
public class Test {
	
	public void show(String s) {
		System.out.println("String method");
	}
	
	public void show(Object o) {
		System.out.println("String method");
	}
	
	public void show(String... s) { // can pass 0 or more args.
		System.out.println("varargs method");
	}
	
	public void sum(int a, float b) {
		System.out.println("int float method");
	}
	
	public void sum(float b, int a) {
		System.out.println("float int method");
	}
	

	public static void main(String[] args) {
		Test t = new Test();
		t.show("abc");
		t.sum(10.0f, 10);
		
		
	}

}
