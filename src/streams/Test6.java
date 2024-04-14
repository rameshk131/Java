package streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test6 {

	public static void main(String[] args) {
		
		// Find the common elements from two int array
				
		int[] arr1 ={3,20,40,2,9,0};
		int[] arr2 ={3,7,4,6,5,2,9,0};	
		
		int[] re = Arrays.stream(arr1).filter(a->Arrays.stream(arr2).anyMatch(a2-> (a2 == a))).toArray();		
		//Arrays.stream(re).forEach(System.out::println);		
		int[] arr3 ={3,20,40,2,9,0};
		
		List<Integer> list = Arrays.asList(2,4,3,8,6);
		int sum = list.stream().mapToInt(e->e.intValue()).sum();
		System.out.println(sum);
		
	}
}
