package com.java.practice;

public class StringDivisibility {
	
	public static int gcd(int a, int b) {
		
		int gcd =1;
		for(int i=1; i <= a && i <= b ; i++) {
			if(a %i ==0 && b %i ==0) {
				gcd =i;
			}
		}
		return gcd;
	}
	
public static int lcm(int a, int b) {		
		int gcd =gcd(a,b);
		return (a*b)/gcd;		
}

public static void smallestString(String s, String t) {
	
	int m = s.length(), n = t.length();	
	int lcm = lcm(m,n);
	
	System.out.println("LCM = "+lcm);
	
	String s1 ="" , t1 = "";
	for(int i =0; i < lcm/m ; i++) {		
		s1 = s1+s;
	}
	for(int i =0; i <lcm/n ; i++) {		
		t1 = t1+t;
	}
	
	if(s1.equals(t1)) {
		System.out.println("OutPut = "+s1);
	}else {
		System.out.println("OutPut = -1");
	}	
}
	

 public static void main(String[] args) {
		
		smallestString("abab","ab");		
		smallestString("ccc","cc");

	}

}
