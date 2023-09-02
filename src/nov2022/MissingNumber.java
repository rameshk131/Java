package nov2022;

import java.util.Arrays;

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

		int arr[] = { 1, 2, 7, 4, 6, 3, 8, 10,5};
		int len = arr.length;
		Arrays.sort(arr);
		int m = 0;
		
		for(int i=0; i<len;i++) {			
			if((i+1) != arr[i]) {
				m=i+1;
				break;
			}
			
		}
		
		System.out.println("Missing no: = "+m);
		
		
	}
}
