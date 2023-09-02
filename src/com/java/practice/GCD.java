package com.java.practice;

public class GCD {
	
	public static int gcd(int a, int b,int c) {
		
		int gcd =1;		
		for(int i=1 ; i<= a && i<= b && i<=c ; i++) {			
			if( a % i == 0 && b % i == 0 && c % i == 0) {
				gcd = i;				
			}
		}
		
		System.out.println("GCD Of "+ a+", "+ b+" , "+ c+"  is : "  +gcd);
		
		return gcd;
	}
	
	public static int lcm(int a, int b,int c) {		
		int gcd = gcd(a,b,c);		
		return (a*b*c)/gcd;
	}
	
	
	public static void main(String[] as) {		
		System.out.println("LCM of 8, 10,16 : "+lcm(8,10,16));		
	}

}
