package com.java.practice;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
	
	public static void main(String[] args) {
	//1.Find  given number is a  prime number?
		
		int n1 =18; 
		boolean flag = false;
		for(int i=2;i <= n1/2 ;i++) {
			if(n1 % i == 0) {
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println(n1 +" is a prime Number !");
		}else {
			System.out.println(n1 +" is not a prime Number !");
		}
		
		//2. Find all prime number between given two numbers.
		int n2 = 7; int n3 = 50;
		List<Integer> primeList = new ArrayList<>();
		
		boolean check = false;
		while(n2 <= n3) {
			check = false;
			for(int i=2 ;i <= n2/2 ; i++) {				
				if(n2 % i == 0) {
					check = true;
					break;
				}
			}
			if(!check) {
				primeList.add(n2);
			}
			n2++;			
		}
		System.out.println(primeList);
		//primeList.stream().forEach(System.out::println);
	}

}
