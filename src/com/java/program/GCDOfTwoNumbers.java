package com.java.program;

public class GCDOfTwoNumbers {
	
	public static void main(String args[]){
	      int a=12, b=16, i, hcf = 0;	     
	      for(i = 1; i <= a || i <= b; i++) {
	         if( a % i == 0 && b % i == 0 )
	         hcf = i;
	      }
	      System.out.println("HCF of given two numbers is ::"+hcf);
	   }

}
