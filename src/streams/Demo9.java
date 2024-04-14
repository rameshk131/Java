package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo9 {

	public static void main(String[] args) {
		
		int [][] twoDArray = {     
		        {1,  2,  3,  4,  40},
		        {5,  6,  7,  8,  50},
		        {9,  10, 11, 12, 60},
		        {13, 14, 15, 16, 70},
		        {17, 18, 19, 20, 80},
		        {21, 22, 23, 24, 900},
		        {25, 26, 27, 28, 100},
		        {29, 30, 31, 32, 110},
		        {33, 34, 35, 36, 120}};

		List list = new ArrayList();
		for (int[] array : twoDArray) {
		    //This will add int[] object into the list, and not the int values.
		    list.add(Arrays.asList(array));
		}
		System.out.println(list);
		
		
		Integer[][] twoDArray2 = {     
		        {1,  2,  3,  4,  40},
		        {5,  6,  7,  8,  50},
		        {9,  10, 11, 12, 60},
		        {13, 14, 15, 16, 70},
		        {17, 18, 19, 20, 80},
		        {21, 22, 23, 24, 90},
		        {25, 26, 27, 28, 100},
		        {29, 30, 31, 32, 110},
		        {33, 34, 35, 36, 120}};

		List list2 = new ArrayList();
		for (Integer[] array : twoDArray2) {
		    //This will add int values into the new list 
		    // and that list will added to the main list
		    list2.add(Arrays.asList(array));      
		}
		System.out.println(list2);
		
		List<List<Integer>> finalList  = Arrays.stream(twoDArray2).map(e->Arrays.stream(e).collect(Collectors.toList())).collect(Collectors.toList());
		
	}

}
