package com.java.program;

public class PrimeNumbers {
	
	public static void main(String[] args) {
//Find all prime number between given two numbers.
        int low = 23, high = 50;
        while (low < high) {
            boolean flag = false;
            for(int i = 2; i <= low/2; i++) {                
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }//end for
            if (!flag)
                System.out.print(low + " ");

            low++;
        }// end while
       
        
        
        // A given number is prime
        
        /*
		int key = 31;
		boolean flag = false;
		for (int i = 2; i <= key / 2; i++) {
			if (key % i == 0) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println(key + " is Not a Prime Number");
		} else
			System.out.println(key + " is a Prime Number");*/

	}

}
