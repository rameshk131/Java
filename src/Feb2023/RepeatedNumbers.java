package Feb2023;

import java.util.HashMap;
import java.util.Map;

public class RepeatedNumbers {

	public static void main(String[] args) {
		// How to find repeated numbers in an array if it contains multiple duplicates?
		
		int a[] = {2,4,3,7,4,6,7,2,4,3,4,9};
		
		Map<Integer,Integer> reated = new HashMap<>();
		
		for(int i=0;i<a.length;i++) {
			
			if(reated.containsKey(a[i])) {				
				reated.put(a[i], reated.get(a[i])+1);
			}else {
				reated.put(a[i], 1);
				
			}
		}
		
		System.out.println(reated.toString());
		
	}

}
