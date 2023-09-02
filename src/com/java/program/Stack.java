package com.java.program;

public class Stack {
	
	private final int MAX = 1000;
	int top = -1;
	int[] a = new int[MAX];
	public Stack(){
		
	}
	public boolean push(int value){
		if(top >= (MAX-1)){
			return false;
		}else{			
			a[++top] = value;			
			System.out.println(value+ " pushed into stack");
			return true;
		}		
	}
	
	public int pop(){
		
		if(top < 0){
			return 0;
		}else{
			int value = a[top--];
			 System.out.println(value+ " pop from stack");
			return value;
		}		
	}
	
	public static void main(String[] arg){		
		Stack stack = new Stack();
		stack.push(20);
		stack.push(40);
		stack.push(23);
		stack.push(12);
		stack.push(28);
		
		stack.pop();
		stack.pop();
		
	}

}
