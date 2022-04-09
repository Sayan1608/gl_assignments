package com.dsa.postfixEvaluator;

import java.util.Stack;

public class PostfixEvaluator {

	public static int evaluate(String postfix) {
		Stack<Integer> opStack = new Stack<Integer>();

		for (int i = 0; i < postfix.length(); i++) {
			char ch = postfix.charAt(i);

			if (Character.isLetterOrDigit(ch)) {
				opStack.push(ch - '0');
			} else {
				int op2 = opStack.pop();
				int op1 = opStack.pop();

				switch (ch) {
				case '^':
					opStack.push((int) Math.pow(op1, op2));
					break;
				case '/':
					opStack.push(op1 / op2);
					break;
				case '*':
					opStack.push(op1 * op2);
					break;
				case '-':
					opStack.push(op1 - op2);
					break;
				case '+':
					opStack.push(op1 + op2);
					break;
				}
			}
		}
		return opStack.pop();
	}

	public static void main(String[] args) {
		String postfix = "1230^5-*+";
		int ans = evaluate(postfix);
		System.out.println(ans);
	}

}
