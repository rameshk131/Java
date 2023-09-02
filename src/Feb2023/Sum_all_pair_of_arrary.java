package Feb2023;

public class Sum_all_pair_of_arrary {

	public static void main(String[] args) {
		// How to Find all Pairs in Array of Integers Whose sum is Equal to a Given Number in Java?
		
		
		//int a[] = {7,2,4,-3,20,8,1,12};		
		//int[] a = { 2, 4, 3, 5, 7, 8, 9 }; 
		int[] a = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };
		int key = 7;
		int i=0,j=0;
		
		for(;i<a.length-1;i++) {
			 j= i+1;
			for(;j<a.length;j++) {				
				if(a[i]+a[j] == key) {
					System.out.println("pair found: ("+a[i]+","+a[j]+")");
					
				}
			}
		}

	}

}
