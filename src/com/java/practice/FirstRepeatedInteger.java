package com.java.practice;

import java.util.*;

public class FirstRepeatedInteger {
	
	
	public static void main(String[] as) {
		
		int arr[] = { 10, 5, 3, 4, 3, 5, 6 };
		Set<Integer> myset = new HashSet<>();
		
		for(int x : arr) {
			if(!myset.contains(x)) {
				myset.add(x);
			}else {
				System.out.println("first repeated integer is : "+x);
				break;
			}
			
		
		}
		
	}
}
