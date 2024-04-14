package java11Features;

import java.util.HashMap;
import java.util.Map;

public class UnmodifiableCollection {

	public static void main(String[] args) {
		
		/*
		List<String> list = new ArrayList<>();
		list.add("ramesh");
		list.add("suresh");
		list.add("cpdy");
		List<String> list2 = List.copyOf(list);		
		list.add("change");		
		System.out.println(list);
		
		*/
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");		
		Map<Integer,String> map1 = Map.copyOf(map);
		map.put(5, "e");		
		System.out.println(map);

	}

}
