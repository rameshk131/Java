package java11Features;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		 
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Geeks");
        map.put(2, "forGeeks");
        map.put(3, "A computer Portal");      
        System.out.println("Map: " + map);
        
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        
        System.out.println("set: " + set);
        
        
	}

}
