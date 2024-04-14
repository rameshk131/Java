package programmingTest;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseString {
	

	public static void main(String[] args) {
		
	  String name = "Ramesh";
	  String rev = Stream.of(name).map(word->new StringBuilder(word).reverse()).collect(Collectors.joining());
	  System.out.println("rev = "+rev);
		
	  String str = "reverse each word of a string using java 8 stream";	 
	  
	  String reverse = Arrays.stream(str.split(" ")).map(word->new StringBuffer(word).reverse().toString()).collect(Collectors.joining(" "));	    
	  //System.out.println(reverse);
	  // Best Methods to reverse string using java 8 stream	  
	  String reverse2 = str.chars().mapToObj(num->
	  	{ 	
	  		//System.out.println(String.valueOf((char)num) +" "+num);	  		
	  		//System.out.println(String.valueOf((char)num));	  					
		  return String.valueOf((char)num);}).reduce((s1, s2)->
		  { System.out.println(s2+" "+s1);
			  return (s2+s1);
			  }).orElse("");
	  
	  
	  System.out.println("reverse2 = "+reverse2);
	  
	  
	  
	}
	
	
	
	

}
