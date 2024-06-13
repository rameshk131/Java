package programAskedByCompany;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CharCount {

	public static void main(String[] args) {
		
		String[] str = {"aaryanna", "aayanna", "airianna", "alassandra", "allanna", "allannah", "allessandra", "allianna",
		    			"allyanna", "anastaisa", "anastashia", "anastasia", "annabella", "annabelle", "annebelle"};
		
	Map<String, Long> mm =	Arrays.stream(str).filter(s->s.startsWith("aa")).collect(Collectors.toMap(s->s, s->s.chars().distinct().count()));
	
	System.out.println(mm);
		
		
		
		
//		String[] stringArray = {"hello", "world", "java", "streams"};
//
//        long distinctCharacterCount = Arrays.stream(stringArray)
//                .flatMapToInt(s->s.chars())    // Convert each String to an IntStream of characters
//                .distinct()                     // Remove duplicates
//                .count();                       // Count the distinct characters
//
//        System.out.println("Distinct Character Count: " + distinctCharacterCount);
		

	}

}
