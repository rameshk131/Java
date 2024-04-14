package streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test5 {

	public static void main(String[] args) {
				
		int [][] ar1 = new int[][] {{ 3, 7 }, { 5, 2 }, { 8, 4 },{6,0}};		
		Integer[][] ar2 = { { 3, 7 }, { 5, 2 }, { 8, 4 } };
		Stream<Integer[]> st = Arrays.stream(ar2);
		int max = st.flatMap(e->Arrays.stream(e)).mapToInt(e->e).max().getAsInt();
		//System.out.println(max);		
		List<Integer> li = Arrays.stream(ar1).flatMapToInt(e->Arrays.stream(e)).boxed().collect(Collectors.toList());
		System.out.println(li);
		
	}
}
