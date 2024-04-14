package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo8 {

	public static void main(String[] args) {
		
	int[][] arr1 ={{9,7,8}, {4,9,6}};
	int [] [] twoDimArray = new int[][]{ {9,2}, {3,5}, {8,15}};
	
	List< List<Integer> > nestedLists =
            Arrays.
            //Convert the 2d array into a stream.
            stream(twoDimArray).
            //Map each 1d array (internalArray) in 2d array to a List.
            map(
                    //Stream all the elements of each 1d array and put them into a list of Integer.
                    internalArray -> Arrays.stream(internalArray).boxed().collect(Collectors.toList()
                )
    //Put all the lists from the previous step into one big list.
    ).collect(Collectors.toList());

    nestedLists.forEach(System.out::println);	
	int min = Arrays.stream(arr1).flatMapToInt(a->Arrays.stream(a)).min().getAsInt();
	System.out.println(min);
	int min1 =nestedLists.stream().flatMap(list->list.stream()).mapToInt(e->e).min().getAsInt();
	System.out.println(min1);
		
	}

}
