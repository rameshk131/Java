package com.features.java8;

import java.util.Arrays;
import java.util.List;

public class StreamDemo1 {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1,2,3);
		List<Integer> l2 = Arrays.asList(4,5,6);
		
		List<List<Integer>> numList = Arrays.asList(l1,l2);		
		//numList.stream().forEach(System.out::println);
		numList.stream().flatMap(i -> i.stream().map(x->x*x)).forEach(System.out::println);

	}

}
