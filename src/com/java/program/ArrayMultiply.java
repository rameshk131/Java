package com.java.program;

public class ArrayMultiply {

	public static void main(String[] args) {		
		
		int[] a = {1,2,3,4,5,6};
		int len = a.length;
		int[] m= new int[len]; //720(2*3*4*5*6),360(1*3*4*5*6),240,180,144,120
		int multiply =1;
		int i=0;
		
		for(int k=0;k<len;k++){			
			if(i== len){
				break;
			}
			if(i != k){
				multiply = multiply*a[k];
			}			
			if(k==len-1){
				m[i] = multiply;
				k=0;
				i++;
				multiply =1;
			}
		}
		for(int x : m)
		System.out.println(x);

	}

}