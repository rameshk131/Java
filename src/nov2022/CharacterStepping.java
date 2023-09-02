package nov2022;

public class CharacterStepping {
	
	public static void main(String[] args) {

		//String str = "RAMZEY";
		String str = "ramzey";
		int shift = 2;
		StringBuilder sb = new StringBuilder();
		char ch;		
		for(int i=0; i<str.length();i++) {			
			int p = (int)str.charAt(i);
			
			if(p <=90) {
				
				int sp = p+shift;
				if(sp > 90) {
					sb.append((char)(sp-26));
				}else {
					sb.append((char)(sp));
				}			
				
			}else {
				int sp = p+shift;
				if(sp > 122) {
					sb.append((char)(sp-26));
				}else {
					sb.append((char)(sp));
				}			
			}
			
			
		}		
		System.out.println(sb.toString());
		
		
		
		
		
		//y+2 = A ==> 89+2-26 = 65
		
		//System.out.println(sb.toString());
		
		//A-65+26 =90(Z)
				
	}


}
