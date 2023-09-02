package nov2022;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
	
	public static void main(String[] args) {
	//1.Find  given number is a  prime number?
		
		int n =5; 
		boolean flag = false;
		int x = n/2;
		
		for(int i=2;i<=x;i++) {
			if(n%i == 0) {
				flag = true;
				break;				
			}
		}
		if(flag)
		System.out.println("Given no. is not prime :"+n);
		else 
			System.out.println("Given no. is prime :"+n);
		
		
	}

}
