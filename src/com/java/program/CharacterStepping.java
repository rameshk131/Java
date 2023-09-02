package com.java.program;

public class CharacterStepping {
	
	public static void main(String[] args) {

		String str = "DECODE";		
		int shift = 2;
		int num =0;
		char ch;		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {			
			num = (int) str.charAt(i);

			if (Character.isUpperCase(str.charAt(i))) {	
				 ch = (char) (((num + shift - 65) % 26) + 65);								
			} else {					
				 ch = (char) (((num + shift - 97) % 26) + 97);				
			}
			sb.append(ch);
		}
		System.out.println(sb.toString());		
				
	}


}
