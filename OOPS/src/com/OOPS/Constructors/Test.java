package com.OOPS.Constructors;

public class Test {
	int i;
	Test(int i){
		this.i = i;
		System.out.println("parameterized constuctor");
	}
	public static void main(String[] args) {
		Test t = new Test(10);
		System.out.println(t.i);
	}

}
