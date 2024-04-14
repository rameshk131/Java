package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test8 {

	public static void main(String[] args) {
		
		// find odd and even elements
		int[] arr1 = {3,20,40,2,9,0,6,5};		
		Map<Boolean,List<Integer>> oddEvenMap = Arrays.stream(arr1).boxed().collect(Collectors.partitioningBy(e-> e%2==0));		
		System.out.println(oddEvenMap);		
		List<String> names = Arrays.asList("ramesh", "suresh","ramesh", "mahesh","sriram");
		Map<String, Long> WordCount = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));		
		System.out.println(WordCount);
			
	}
}
