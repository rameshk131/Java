package com.java.program;

import java.util.Arrays;

public class MaxSequence {
	
	public static void main(String[] args) {
		String s="maxoccuringchar";
		char[] schar=s.toCharArray();
		Arrays.sort(schar);
		s = String.valueOf(schar);
		
		int count=0,curr_count=0;
		char c = schar[0];		
		for(int i= 0; i < s.length(); i++){
			curr_count = 1;
			for(int j=i+1;j<s.length();j++){
				if(s.charAt(i)== s.charAt(j)){
					curr_count++;
				}else{
					break;
				}				
			}
			if(count < curr_count){
				count = curr_count;
				c=s.charAt(i);
			}
		}
		System.out.println(c +" :: "+count);
		System.out.println(c +" :: "+s.substring(s.indexOf(c),s.indexOf(c)+count));
	}
}
