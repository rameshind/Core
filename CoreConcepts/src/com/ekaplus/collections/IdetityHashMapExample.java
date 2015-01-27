package com.ekaplus.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class IdetityHashMapExample {

	
	public static void main(String[] args) {
		
		Map<String,String> map=new LinkedHashMap<String, String>();
		map.put("a", "6");
		map.put(null, "6");
		map.put("b", "6");
		map.put("aa", "6");
		map.put("nnnnnnnn", "6");
		map.put(null, "7");
		
		
		Map<String,String> Hashmap=new HashMap<String, String>();
		Hashmap.put("a", "6");
		Hashmap.put(null, "6");
		Hashmap.put("b", "6");
		Hashmap.put("aa", "6");
		Hashmap.put("nnnnnnnn", "6");
		Hashmap.put(null, "7");
		
		System.out.println(Hashmap);
		
		Map<? super Integer,? extends Thread> Hashmap1=new HashMap< Number, Thread>();
		
		
		
		
		
		
		
		map.put("f", "6");
		System.out.println(map);
		Set set=new LinkedHashSet();
		set.add("ss");
		set.add(null);
		set.add(2);
		set.add("jj");
		set.add("jsj");
		set.add("jaj");
		set.add(null);
		set.add(null);
		
		
		System.out.println(set);
		
		
	}

}
