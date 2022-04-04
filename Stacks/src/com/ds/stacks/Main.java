package com.ds.stacks;

public class Main {

	public static void main(String[] args) {

		StackImplementation st = new StackImplementation();

//		if(st.push(10)) {
//			System.out.println("10 pushed to stack.");
//		}else {
//			System.out.println("Stack Overflow error.");
//		}

		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);

		System.out.println("Stack Elements :");
		st.printStack();

		System.out.println(st.pop() + " popped out.");
		System.out.println("Stack Elements :");
		st.printStack();
		System.out.println(st.pop() + " popped out.");
		System.out.println(st.pop() + " popped out.");
		System.out.println(st.pop() + " popped out.");
		System.out.println(st.pop() + " popped out.");
		
		System.out.println("Stack Elements :");
		st.printStack();

	}

}
