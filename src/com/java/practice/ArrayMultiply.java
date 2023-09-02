package com.java.practice;

import java.util.Arrays;
import java.util.List;

public class ArrayMultiply {

	public static void main(String[] args) {	
		
		int[] arr = {4,6,2,3,10,5};		
		int len = arr.length;
		int[] arr1 = new int[len];
		int i=0;
		int multiply = 1;
		
		for(int j=0 ; j< len ;j++) {
		
			if(len == i) {
				break;			
			}
			
			if(i != j) {
				
				multiply = multiply*arr[j];
			}
			
			if(j == (len-1)) {
				
				arr1[i] = multiply;
				i++;
				multiply =1;
				j=0;
			}		
		}
		
		
		for(int x : arr1) {
			System.out.println(x);
		}
		
		
	}

}