package com.java.practice;

import java.util.*;

public class FindDuplicate {
	public static void main(String[] args) {
		
		int[] arr = { 1, 2,2, 3 };		
		int n=4;
		
		for (int i = 0; i < n; i++) {
            int index = arr[i] % n;                      
            arr[index] += n;
        }
		List<Integer> duplicates = new ArrayList<>();
		for (int i = 0; i < n; i++) {
            if (arr[i] / n >= 2) {
                duplicates.add(i);
            }
        }
		System.out.println(duplicates);
	}

}
