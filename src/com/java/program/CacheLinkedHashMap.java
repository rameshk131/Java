package com.java.program;

import java.util.LinkedHashMap;
import java.util.Map;

public class CacheLinkedHashMap  extends LinkedHashMap<Integer,String>{
	private static final long serialVersionUID = -603307801819477440L;
	private int cachesize=0;
	public CacheLinkedHashMap(int size){
		super(size,0.75f,true);
		this.cachesize = size;
				
	}
	
	@Override
	protected boolean removeEldestEntry(Map.Entry<Integer,String> eldest){		
		return size() > cachesize;
	}
	

	public static void main(String[] args) {
		
		CacheLinkedHashMap obj = new CacheLinkedHashMap(2);
		obj.put(100, "Ramesh");
		obj.put(101, "Suresh");
		System.out.println(obj);
		obj.get(101);
		//obj.put(100, "Ramesh");
		obj.put(102, "Tushar");
		System.out.println(obj);

	}

}
