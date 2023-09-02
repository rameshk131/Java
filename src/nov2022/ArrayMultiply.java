package nov2022;

import java.util.Arrays;

public class ArrayMultiply {

	public static void main(String[] args) {
		
		int[] arr = {2,8,6,3,9,4};//
		//int[] arr = {1,2,3,4,5,6};
		
		//2,3,4,6,8,9
		//Arrays.sort(arr);
		int len = arr.length;
		int[] res = new int[len];
		int multiply = 1;
		int j=0;		
		for(int i=0;i<len;i++) {
			j=0;multiply=1;
			for(;j<len; j++) {
				if(i != j) {
					multiply = multiply*arr[j];
				}				
			}
			System.out.println(multiply);
			res[i] = multiply;
		}
		
		System.out.println("-------------------------");
		for(int x =0;x<len;x++)
		System.out.println(res[x]);
		
	}
}
