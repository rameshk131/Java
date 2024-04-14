package programmingTest;

import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharInString {
	

	public static void main(String[] args) {
		
		String name = "anandha";
		Map<Character, Long> map = name.chars().mapToObj(num->(char)num).collect(Collectors.groupingBy(ch->ch,Collectors.counting()));	  
		map.forEach((k,v)-> System.out.println(k+" "+v));
	}
	
	
	
	

}
