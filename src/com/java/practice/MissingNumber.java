package com.java.practice;

public class MissingNumber {
	
	/* 
	 * You are given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in the list. 
	 * One of the integers is missing in the list. Write an efficient code to find the missing integer.
		Example: Input: arr[] = {1, 2, 4, 6, 3, 7, 8}
		Output: 5
		Explanation: The missing number from 1 to 8 is 5
	 * 
	 * 
	 * */

	public static void main(String[] args) {

		int arr[] = { 1, 2, 7, 4, 5, 3, 8, 9 };
		int len = arr.length;
		System.out.println("len = "+len);
		int n= len+1;
		int sum =0;
		int totalsum = n*(n+1)/2;
		System.out.println(totalsum);
		
		for(int i =0; i<len;i++) {
			sum = sum+arr[i];
		}
		System.out.println(sum);		
		System.out.println("Missing No: "+(totalsum-sum));
	}
}
