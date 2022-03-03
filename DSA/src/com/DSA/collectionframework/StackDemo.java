package com.DSA.collectionframework;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();

		System.out.println(stack.isEmpty());

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(5);

		System.out.println("Stack: " + stack);

		System.out.println(stack.peek());
		System.out.println("Stack: " + stack);
		
		System.out.println(stack.pop());
		System.out.println("Stack: " + stack);
		
		
	}

}
