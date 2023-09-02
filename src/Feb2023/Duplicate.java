package Feb2023;

import java.util.Arrays;

public class Duplicate {

	public static void main(String[] args) {
		
		//Remove Duplicate element from int array
		//int[] a= {9,5,7,9,3,0,2,6,5,3,9};	
		//Arrays.sort(a);	
		int[] a = {1, 2, 3, 3, 3, 3, 5, 5, 6, 7, 9, 9, 10};
		int len = a.length;
		int[] result = new int[len];
		int p = a[0];
		result[0] = p;		
		
		for(int i=1;i<len;i++) {			
			if(a[i] != p) {
				result[i]=a[i];				
			}
			p=a[i];
		}
		
		System.out.println(Arrays.toString(result));
		
		
			
			
	
	}

}
