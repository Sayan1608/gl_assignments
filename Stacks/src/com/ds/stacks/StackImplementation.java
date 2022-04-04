package com.ds.stacks;

public class StackImplementation {

	static final int SIZE = 1000;
	int current_pointer;
	int[] arr = new int[SIZE];

	public StackImplementation() {
		current_pointer = -1;
	}

	public boolean push(int e) {
		if (current_pointer >= SIZE - 1) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			arr[++current_pointer] = e;
			return true;
		}

	}

	public int pop() {
		if (current_pointer < 0) {
			System.out.println("Stack Underflow");
			return -1;
		} else {
			int x = arr[current_pointer--];
			return x;
		}
	}

	public void printStack() {
		for (int i = current_pointer; i > -1; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
