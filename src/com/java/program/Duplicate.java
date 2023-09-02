package com.java.program;

public class Duplicate {

	public static void main(String[] args) {
		
		//Remove Duplicate element from int array
		//int[] a= {9,5,7,9,3,0,2,6,5,3,9};	
		//Arrays.sort(a);	
		int[] a = {1, 2, 3, 3, 5, 5, 6, 7, 9, 9, 10};
		int i=0,j=0;
		int len = a.length;
		int[] temp = new int[len];		
		for(;i<len-1;i++){			
			if(a[i] != a[i+1]){
				temp[j]= a[i];
				j++;
			}
		}		
		temp[j] = a[i];
		
	/*............for Out put ..............................*/
		
		int[] output = new int[j+1];		
		for (int k = 0; k < j+1; k++) {			
			output[k] = temp[k];
		}	
		for (int k = 0; k < output.length; k++) {
			System.out.println(output[k]);			
		}

	}

}
