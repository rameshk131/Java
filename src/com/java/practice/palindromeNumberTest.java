package com.java.practice;

public class palindromeNumberTest {
	
	public static void main(String[] args) {
		
		int n = 428;
		int temp = n;
		int sum=0;
		
		while(n>1) {
			
			int x = n%10;
			sum = sum*10+x;
			n = n/10;
			
		}
        
		if(temp == sum) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}

	}

}
