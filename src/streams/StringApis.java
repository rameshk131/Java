package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringApis {

	public static void main(String[] args) {
		
		
		String str1 = "Ramesh Kumar Yadav";
		
		// String to IntStream
		IntStream strem1 = str1.chars();
		strem1.mapToObj(n-> (char)n).forEach(System.out::println);
		
		// String to charArray
		char[] chArray = str1.toCharArray();
		for(char ch : chArray) {
			if(ch == 'a') 			
			System.out.println(ch);
		}
		
		// Declaration and initialization		
		char[]  mycharArray = {'x','y','z','a','b'};
		Character[]  mycharArray2 = {'x','y','z','a','b'};		
		List<char[]> test = Arrays.asList(mycharArray);
		
		//Joining and reduce apis from stream		
		
		String result = Arrays.stream(mycharArray2).map(ch->String.valueOf(ch)).collect(Collectors.joining());
		String result2 = Arrays.stream(mycharArray2).map(ch->String.valueOf(ch)).reduce((s1,s2)->(s2+s1)).get();
		System.out.println(result2);
		
	}

}
