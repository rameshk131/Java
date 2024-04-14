package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateStringCount {
	

	public static void main(String[] args) {
		
	  List<String>  list = Arrays.asList("ramesh", "suresh", "ramesh","sriram","suresh");	  
	  Map<String, Long> dup_count= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	  System.out.println(dup_count);	  
	  dup_count.forEach((k,v)-> System.out.println(k +" "+v));
	 
	  
	}
}
