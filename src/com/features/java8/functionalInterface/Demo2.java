package com.features.java8.functionalInterface;

public class Demo2 {

	public static void main(String[] args) {
		
		Hello hello = (a)->{return a != 0 && a==20 ;};
		
		boolean x = hello.myFilter(20);
		System.out.println(x);
		

	}

}
