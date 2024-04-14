package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Test1 {

	public static void main(String[] args) {
		
// similar to int we can declare  byte , short, boolean, long, float ,double, char
		
//		Data Type	Default Values
//		--------------------------
//		Byte	0
//		Short	0
//		Int		0
//		Long	0
//		Float	0.0
//		Double	0.0
//		Boolean	false
//		Char	‘\u0000′ which is the Unicode for null
//		Object	null
		
		long[] arr1 = new long[5];
		int[] arr2 = new int[] {3,7,4,6,5,2,9,0};
		int[] arr3 ={3,7,4,6,5,2,9,0};
		List<Integer> list = Arrays.asList(1,3,0,5,4,8);		
		List<int[]> list2 = Arrays.asList(arr2);		
		Integer a[] ={ 10, 20, 30, 40 };
		List<Integer> list3 = Arrays.asList(a);		
		IntStream st = Arrays.stream(arr3);		
		for(int i=0; i< arr1.length;i++){		
			System.out.println(arr1[i]);
		}
		

		
	}
}
