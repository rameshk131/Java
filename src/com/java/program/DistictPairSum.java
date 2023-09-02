package com.java.program;

import java.util.HashMap;

/*
	Count distinct pairs with given sum
	Given an array arr[] of size N and an integer K, the task is to find the count of distinct pairs in the array whose sum is equal to K.

Examples:

Input: arr[] = { 5, 6, 5, 7, 7, 8 }, K = 13 
Output: 2 
Explanation: 
Pairs with sum K( = 13) are { (arr[0], arr[5]), (arr[1], arr[3]), (arr[1], arr[4]) }, i.e. {(5, 8), (6, 7), (6, 7)}. 
Therefore, distinct pairs with sum K( = 13) are { (arr[0], arr[5]), (arr[1], arr[3]) }. 
Therefore, the required output is 2.

Input: arr[] = { 2, 6, 7, 1, 8, 3 }, K = 10 
Output : 2 
Explanation: 
Distinct pairs with sum K( = 13) are { (arr[0], arr[4]), (arr[2], arr[5]) }. 
Therefore, the required output is 2.
 * 
 */

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DistictPairSum {

	public static void main(String[] args) {
		int[] a = { 5, 6, 0, 10, 2, 8, 7, 4, 6, 7 };
		int key = 10;
		int l = a.length;
		int count = 0;
		Map<Integer, Integer> map = new HashMap<>();
		System.out.println(a);
		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {
				if (a[i] + a[j] == key) {
					map.put(a[i], a[j]);
				}
			}
		}

		System.out.println(map);
		Set<Integer> set = new HashSet();
		for (Integer key1 : map.keySet()) {
			int val = map.get(key1);
			if (!map.containsKey(val)) {
				count++;
			} else if (map.containsKey(val)) {
				count++;
			}
		}
		System.out.println("count = " + set.size());

	}

}
