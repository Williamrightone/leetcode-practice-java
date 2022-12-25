package tw.william.leetcode.leet.easy;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {

		String brackets = "(])";

		System.out.println(isValid(brackets));

	}

	static boolean isValid(String s) {

		char[] charArr = s.toCharArray();

		Stack<Character> stack = new Stack<Character>();

		for (char ch : charArr) {

			if (ch == '(' || ch == '{' || ch == '[') {

				stack.push(ch);

			}

			if (ch == ')' || ch == '}' || ch == ']') {

				if (stack.isEmpty()) {
					return false;
				} else if (ch == ')' && stack.peek() == '(') {

					stack.pop();

				} else if (ch == '}' && stack.peek() == '{') {
					stack.pop();
				} else if (ch == ']' && stack.peek() == '[') {
					stack.pop();
				} else {
					return false;
				}

			}

		}

		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}

}
