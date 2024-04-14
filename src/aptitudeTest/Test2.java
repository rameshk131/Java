package aptitudeTest;

import java.util.*;

class A{
	
}

public class Test2 {

	public static void main(String[] args) {
		
		Object i = new ArrayList().iterator();  
        System.out.print((i instanceof List) + ", ");  
        System.out.print((i instanceof Iterator) + ", ");  
        System.out.print(i instanceof ListIterator); 

	}

}
