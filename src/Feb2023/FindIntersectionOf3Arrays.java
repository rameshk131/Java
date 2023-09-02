package Feb2023;

import java.util.Arrays;

public class FindIntersectionOf3Arrays {

	public static void main(String[] args) {
		// Find common elements in three sorted arrays
		
		int a1[] = {1, 5,10,20, 10, 20, 40, 80} ;
		int a2[] = {6, 7,7,80, 20, 80, 100} ;
		int a3[] = {3, 4,15,30,80, 15, 20, 30, 70, 80, 120} ;
		Arrays.sort(a1);
		Arrays.sort(a2);
		Arrays.sort(a3);
		
		int l1=a1.length, l2=a2.length,l3=a3.length;
		int i=0,j=0,k=0;
		
		while(i<l1 && j<l2 && k<l3) {
			
			if(a1[i]== a2[j] && a2[j] == a3[k]) {
				System.out.println(a1[i]+" ");
				i++;j++;k++;
			}else if(a1[i] < a2[j]) {
				i++;
				
			}else if(a2[j] < a3[k] ) {
				
				j++;
				
			}else {
				k++;
			}
		}

	}

}
