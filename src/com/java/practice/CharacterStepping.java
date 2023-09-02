package com.java.practice;

public class CharacterStepping {
	
	public static void main(String[] args) {

		String str = "RAMESH";
		int shift = 2;
		StringBuilder sb = new StringBuilder();
		char ch;
		int num =0;
		
		for(int i=0 ; i<str.length();i++) {			
			num = (int)str.charAt(i);
			
			if(Character.isUpperCase(str.charAt(i))) {
				ch = (char)(((num+shift-65) % 26) +65);
			}else {				
				ch = (char)(((num+shift-97) %26) +97);
			}
			
			sb.append(ch);
			
		}
		System.out.println(sb.toString());
				
	}


}
