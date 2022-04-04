package com.ds.stacks;

public class StackImplementation {

	private static final int SIZE = 1000;
	private int current_pointer;
	private int[] arr = new int[SIZE];
	private int min = Integer.MAX_VALUE;

	public StackImplementation() {
		current_pointer = -1;
	}

	public boolean push(int e) {
		if (current_pointer >= SIZE - 1) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			arr[++current_pointer] = e;
			if(e < min) {
				min = e;
			}
			return true;
		}

	}

	public int pop() {
		if (current_pointer < 0) {
			System.out.println("Stack Underflow");
			return -1;
		} else {
			int x = arr[current_pointer--];
			
			if(min == x && current_pointer >= 0) {
				min = arr[current_pointer];
			}
			return x;
		}
	}
	
	public int getMin() {
		return min;
	}

	public void printStack() {
		for (int i = current_pointer; i > -1; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
