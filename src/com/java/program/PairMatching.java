package com.java.program;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PairMatching {

	public static void main(String[] arg) {
		//Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt(); //size of array
		//int[] arr = new int[n];
		int[] arr ={5,6,0,10,2,8,7,4,6,7};	
		
		Map<Integer, Integer> map = new HashMap<>();

		//input the array
		for (int i = 0; i < arr.length; i++) {
			

			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		int target = 10; // input target element

		// iterate and check
		int masterCount = 0;
		for (int i = 0; i < arr.length; i++) {
			int p = arr[i];

			if (map.containsKey(p)) {
				int count = map.get(p);
				int q = target - p;

				if (map.containsKey(q)) {
					if (p == q && count >= 2) {
						masterCount++;

						// remove from map
						int pCount = map.get(p) - 2;

						if (pCount <= 0) {
							map.remove(p);
						} else {
							map.put(p, pCount);
						}
					} else if (p != q) {
						masterCount++;

						// remove both from map
						int pCount = map.get(p) - 1;
						int qCount = map.get(q) - 1;

						if (pCount <= 0) {
							map.remove(p);
						} else {
							map.put(p, pCount);
						}

						if (qCount <= 0) {
							map.remove(q);
						} else {
							map.put(p, qCount);
						}
					}
				} else {
					continue;
				}
			}
		}
		
		System.out.println(masterCount);
	}
}
