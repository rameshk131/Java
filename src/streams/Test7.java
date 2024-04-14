package streams;

import java.util.Arrays;

public class Test7 {

	public static void main(String[] args) {
		
		// Find the common elements from two int array
		int[][] arr1 = {{3,20},{40,2},{9,0},{6,5}};		
		Arrays.stream(arr1).flatMapToInt(e->Arrays.stream(e)).max().getAsInt();
		
		int[][] arr2 = {{1,2},{3,4},{5,6}};
		int sum = Arrays.stream(arr2).flatMapToInt(a -> Arrays.stream(a)).sum();
		System.out.println(sum);
		
	}
}
