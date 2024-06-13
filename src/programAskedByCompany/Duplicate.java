package programAskedByCompany;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Duplicate {
	
	public static void main(String[] arg) {
	
	String[] dup = {"Sunday", "Monday", "Tuesday", "Wednesday", "Sunday", "Monday"};
	
	Map<String, Long> map = Arrays.stream(dup).collect(Collectors.groupingBy(s->s,Collectors.counting()));	
	System.out.println(map);
	
	map.forEach((k,v)-> {		
		if(v > 1) {
			System.out.println(k);
		};		
	});
	
	}
}
