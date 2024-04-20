package programmingTest;

public class ReverseString {
	

	public static void main(String[] args) {
		
	  		
	  //String str = "reverse each word of a string using java 8 stream";
	  
	  String str = "Ramesh";
	  
	  String reverse1 = str.chars().mapToObj(num->String.valueOf((char)num)).reduce((s1, s2)->(s2+s1)).orElse("");
	  System.out.println(reverse1);
		  
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
