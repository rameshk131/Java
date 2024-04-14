package streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Test2 {

	public static void main(String[] args) {				
		int[] arr1 ={3,7,11,45,20,40,2,9,0};
		int[] arr2 ={3,7,4,6,5,2,9,0};
		
		IntStream st = Arrays.stream(arr2);
		int max = st.max().getAsInt();
		System.out.println(max);		
		System.out.println("------------------------------");		
		Integer[] arr3 ={3,7,4,6,8,2,9,0,5};
		int m2 = Arrays.stream(arr3).limit(6).min((e1,e2)->e1.compareTo(e2)).get();
		System.out.println("-----m2--> "+m2);
		List<Integer> list = Arrays.asList(arr3);
		//list.stream().skip(3).limit(2).forEach(System.out::println);
		OptionalDouble d = list.stream().mapToInt(e->e.intValue()).average();
		//System.out.println(d.getAsDouble());
		
	}
}
