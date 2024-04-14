package streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test4 {

	public static void main(String[] args) {
				
		 // Creating a list of Strings 
        List<String> list = Arrays.asList("1", "2", "3","4", "5");
        // Using Stream flatMapToInt(Function mapper) 
//        list.stream().flatMapToInt(num -> IntStream.of(Integer.parseInt(num))). 
//        forEach(System.out::println);        
        list.stream().map(num->Integer.parseInt(num)).forEach(System.out::println);
		
	}
}
