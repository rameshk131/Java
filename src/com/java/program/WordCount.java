package com.java.program;

import java.util.Arrays;

public class WordCount {

	public static void main(String[] args) {
		String str ="Test the result test my Test.But-Test is not my Test";
		String key ="test";		
		//String[] arrStr = str.split("[ ,\\.,-]");
		String[] arrStr = str.split("\\W+");
		long count = Arrays.asList(arrStr).stream().filter((element) -> element.equalsIgnoreCase(key)).count();
		/*int count =0;
		for(String s : arrStr){
			if(key.equalsIgnoreCase(s)){
				count++;
			}
		 }	*/	
		System.out.println(count);
	}

}
