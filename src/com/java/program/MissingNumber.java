package com.java.program;

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
		
		int arr[] = {1,2,7,4,5,3,8,9};
		int n = arr.length;
		int missing = 0;
	/*
		int sum1 =0,sum2 =0;
		for(int i=1;i<=10;i++){
			if(i <n)
			sum1 = sum1+arr[i-1];
			sum2 = sum2+i;
		}
		System.out.println(sum2-sum1);
		*/
		int i=1;
		
		for(;i<n;i++){
			if(arr[i] != (i+1)){
				missing = i+1;
				break;
			}		 
		}
		if(i == n){
			missing = n+1;
		}		
		System.out.println("missing number is "+missing);
	}
}
