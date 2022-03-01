package com.greatlearning.Methods;

public class Method {
	
	private int num = 10;

	public int performleftShift() {
		return (num << 1);
	}

	public int performRightShift(int val, int digitstoshift) {
		this.num = val;
		return (num >> digitstoshift);
	}

	public static void main(String[] args) {

		Method obj = new Method();
		System.out.println("10<<1 = "+obj.performleftShift());
		
		System.out.println("45>>2 = "+obj.performRightShift(45, 2));
		
	}

}
