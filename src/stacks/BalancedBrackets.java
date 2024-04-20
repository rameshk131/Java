package stacks;

import java.util.Stack;




public class BalancedBrackets {
	
	
	private static boolean isBracketsBalanced(String brackets) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0;i<brackets.length();i++) {
			
			char ch = brackets.charAt(i);
			
			if(ch == '(' || brackets.charAt(i) == '{' || brackets.charAt(i) == '[') {
				System.out.println(ch);
				stack.push(ch);				
			} 
		}
		System.out.println(stack);
		return true;
	}

	public static void main(String[] args) {		
		
		//String brackets = "{[][]{()()}}";
		String brackets = "([{}])";		
		
		boolean status = isBracketsBalanced(brackets);
		
		if(status) {
			System.out.println(brackets +" is a balaced brackets");
		}else {
		System.out.println(brackets +" is not a balaced brackets");
		}

	}

	

	
}
