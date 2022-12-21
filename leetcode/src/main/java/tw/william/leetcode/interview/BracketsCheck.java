package tw.william.leetcode.interview;

import java.util.Stack;

public class BracketsCheck {

	public static void main(String[] args) {

		String brackets = "{}([)]";
		
		System.out.println(execute(brackets));
		
	}
	
	static boolean execute(String brackets) {
		
		boolean result = false;
		
		String[] bracketsArr = brackets.split("");
		
		Stack<String> bracketsStack = new Stack<String>();
		
		for(int i = 0; i<bracketsArr.length; i++) {
			
			if(bracketsArr[i].equals("(")||bracketsArr[i].equals("{")||bracketsArr[i].equals("[")) {
				bracketsStack.push(bracketsArr[i]);
			}
			
			if(bracketsArr[i].equals(")")||bracketsArr[i].equals("}")||bracketsArr[i].equals("]")) {
				
				if(bracketsArr[i].equals(")")) {
					
					if(bracketsStack.peek().equals("(")) {
						bracketsStack.pop();						
					}
					
				}
				
				if(bracketsArr[i].equals("]")) {
					
					if(bracketsStack.peek().equals("[")) {
						bracketsStack.pop();						
					}
					
				}
				
				if(bracketsArr[i].equals("}")) {
					
					if(bracketsStack.peek().equals("{")) {
						bracketsStack.pop();						
					}
					
				}
					
			}
			
		}
		
		
		if(bracketsStack.isEmpty()) {
			result = true;
		}
		
		
		return result;
	}

}
