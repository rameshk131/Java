package com.features.java8;

public class Hello implements A,B{
	
	public void test() {
		
		m5();
		A.m5();
		B.m5();
	}

	
	public static void m5() {
		System.out.println("Hello -m5");
	}	
		
}
