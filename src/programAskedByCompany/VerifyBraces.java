package programAskedByCompany;

import java.util.Stack;

public class VerifyBraces {

	public static void main(String[] args) {
		
		String br = "{[(])]}";
		
		Stack<Character>  stack = new Stack<>();
		
		for(int i=0;i< br.length(); i++) {
			
			if('{' == br.charAt(i) || '[' == br.charAt(i) || '(' == br.charAt(i)) {
				stack.push(br.charAt(i));
				continue;
			}
		
			char ch1 = stack.pop();
			
			char ch = br.charAt(i);
			
			switch(ch) { 
			
			case '}':
				if(ch1 != '[' && ch !='(') {
					System.out.println(false);
						break;
				}
			
			case ']':
				if(ch1 != '{' && ch1 !='(') {
					System.out.println(false);
				break;
				}
				
			case ')':
				if(ch1 != '{' && ch1 !='[') {
					System.out.println(false);
				break;
				}
			
			default:
				System.out.println(true);
			
			}			
			
		}

	}

}
