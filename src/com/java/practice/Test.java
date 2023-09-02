package com.java.practice;

public class Test {

	public static void main(String[] args) {
		
		char ch ='9';
		System.out.println(Character.getNumericValue(ch));		
		boolean check = ((ch - '0') & 1) != 0 ? true : false;		
		System.out.println(check);

	}

}
