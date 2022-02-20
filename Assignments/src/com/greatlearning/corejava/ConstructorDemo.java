package com.greatlearning.corejava;

public class ConstructorDemo {
	private int constId;
	private String constType;
	
	public ConstructorDemo() {
		this(11,"no-arg");
		System.out.println("Constructor is created."); // no-arg default (unparameterized)constructor
	}
	
	public ConstructorDemo(int constId) { // one-arg parameterized constructor
		this(constId,"one-arg");
//		this.constId = constId;
//		this(constId,"two-args");
		System.out.println("one-arg parameterized constructor created.");
	}
	
	public ConstructorDemo(int constId,String constType) {
		this.constId = constId;
		this.constType = constType;
		System.out.println("two-arg parameterized constructor created.");
	}
	public void displayObjId() {
		System.out.println("id::"+constId);
	}
	
	public void higestDegree() {
		System.out.println("degree::"+constType);
	}

	public static void main(String[] args) {
		ConstructorDemo c1 = new ConstructorDemo(); // Default no-arg constructor called
//		ConstructorDemo c2 = new ConstructorDemo(101);
//		ConstructorDemo c3 = new ConstructorDemo(202,"two-args");
		
		c1.displayObjId();
		c1.higestDegree();
		
//		c2.displayObjId();
//		c2.higestDegree();
		
//		c3.displayObjId();
//		c3.higestDegree();
		
	}

}
