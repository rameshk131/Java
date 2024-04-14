package com.java.program;


/* 
 * Given an integer n, write a function that returns count of trailing zeroes in n!. 
Examples : 

Input: n = 5
Output: 1 
Factorial of 5 is 120 which has one trailing 0.*/

public class TrallingZeroCount {

	public static void main(String[] args) {
		int n= 28;
		tralingZero(n);
	}
	// Function to return trailing 0s in factorial of an interger n 
	public static void tralingZero(int n){		
		int count =0;		
		for(int i=5; i<=n;i=i*5){			
			count = count+n/i;			
		}		
		System.out.println(count);
		
	
	}

}
