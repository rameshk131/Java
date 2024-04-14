package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo10 {

	public static void main(String[] args) {
		
		int[][] multiples = new int[4][2];     // 2D integer array with 4 rows  and 2 columns
		String[][] cities = new String[3][3];  // 2D String array with 3 rows and 3 columns

		//By the way, when you initially declare a two-dimensional array, you must remember to specify the first dimension, 
		//for example following array declaration is illegal in Java.

		//int[][] wrong = new int[][]; // not OK, you must specify 1st dimension
		int[][] right = new int[2][]; // OK
		
		
		String[][] myArray = new String[5][]; // OK 
		String[][] yourArray = new String[5][4]; // OK
		
		
		int[][] arr = { {1, 2, 3}, {4, 5, 6},{7, 8, 9} };
		String[][] salutation = { {"Mr. ", "Mrs. ", "Ms. "}, {"Kumar"} };

		

		



		
	}

}
