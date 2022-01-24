package com.JavaBasics.WhileLoop;

public class WhileLoopAssignment {

	public static void main(String[] args) {
		int i = 10;
		while (i >= 1) {
			System.out.print(i);
			i--;
			if(i>=1) {
				System.out.print(",");
			}
		}
	}

}
