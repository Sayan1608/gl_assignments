package com.dsa.postfixToinfix;

import java.util.Stack;

public class PostfixToInfix {

	public static String convertPostfixToInfix(String postfix) {
		Stack<String> oprStack = new Stack<String>();

		for (int i = 0; i < postfix.length(); i++) {
			char ch = postfix.charAt(i);

			if (Character.isLetterOrDigit(ch)) {
				oprStack.push("" + ch);
			} else {
				String op2 = oprStack.pop();
				String op1 = oprStack.pop();

				oprStack.push("(" + op1 + "" + ch + "" + op2 + ")");
			}

		}
		return oprStack.pop();

	}

	public static void main(String[] args) {
		String postfix = "xyzp^q-*+";
		String infix = convertPostfixToInfix(postfix);
		System.out.println("Postfix : " + postfix);
		System.out.println("Infix : " + infix);
	}

}
