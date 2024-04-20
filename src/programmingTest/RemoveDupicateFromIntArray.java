package programmingTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDupicateFromIntArray {

	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 3, 5, 5, 6, 7, 9, 9, 10};
		List<Integer> list = Arrays.stream(a).distinct().boxed().collect(Collectors.toList());
		System.out.println(list);

	}

}
