package com.dsa.infixTopostfix;

import java.util.Stack;

public class InfixToPostfix {

	public static int precedence(int ch) {
		switch (ch) {
		case '^':
			return 3;
		case '/':
		case '*':
			return 2;
		case '-':
		case '+':
			return 1;
		}
		return -1;
	}

	public static String convertInfixToPostfix(String infix) {
		String postfix = "";
		Stack<Character> opstack = new Stack<Character>();

		for (int i = 0; i < infix.length(); i++) {
			char ch = infix.charAt(i);

			if (Character.isLetterOrDigit(ch)) {
				postfix += ch;
			} else if (ch == '(') {
				opstack.push(ch);
			} else if (ch == ')') {
				while (!opstack.isEmpty() && opstack.peek() != '(') {
					postfix += opstack.pop();
				}
				opstack.pop();
			} else {
				while (!opstack.isEmpty() && (precedence(ch) < precedence(opstack.peek()))) {
					postfix += opstack.pop();
				}
				opstack.push(ch);
			}
			
//			System.out.println(postfix);
		}

		while (!opstack.isEmpty()) {
			postfix += opstack.pop();
		}
		return postfix;
	}

	public static void main(String[] args) {

		String infix = "x+y*(z^p-q)";

		System.out.println("Infix : " + infix);
		System.out.println("Postfix : " + convertInfixToPostfix(infix));
	}

}
