package Feb2023;

import java.util.Arrays;

public class ArrayContainsAnumber {

	public static void main(String[] args) {
		// How to check if array contains a number

		int a[] = { 10, 2, 7, 4, 3, 8,9 }; // {2,3,4,7,8,9,10}
		int key = 21;
		Arrays.sort(a);
		int len = a.length;
		int first = 0;
		int last = len-1;
		int m = 0;

		while (first <= last) {
			
			System.out.println("+++++++++++");
			
			m = (first + last) / 2;

			if (key > a[m]) {
				first = m + 1;
			} else if(key == a[m]) {
				System.out.println("Number Found");
				break;
			}else{
				last = m;
			}
		}
		
		if(first > last)
			
			System.out.println("not found");
			
		
	}

}
