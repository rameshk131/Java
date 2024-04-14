package streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test3 {

	public static void main(String[] args) {
		
		int [][] ar1 = new int[][] {{ 3, 7 }, { 5, 2 }, { 8, 4 },{6,0}};		
		//int[][] ar2 = { { 3, 7 }, { 5, 2 }, { 8, 4 } };
		
		int x = Arrays.stream(ar1).flatMapToInt(e-> Arrays.stream(e)).skip(2).limit(3).findFirst().getAsInt();
		System.out.println(x);

	}
}
