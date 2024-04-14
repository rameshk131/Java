package com.java.program;

public class Factorial {

	public static void main(String[] args) {
		
		int n=4;
		System.out.println(facto(n));
		

	}
	
	public static int facto(int n) {
		
		int f = 1;		
		if(n == 0) {
			return 1;
		}		
		f = n*facto(n-1);
		return f;
	}

}
