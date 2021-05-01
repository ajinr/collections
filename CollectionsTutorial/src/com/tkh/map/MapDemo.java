package com.tkh.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> nameMap= new HashMap<Integer, String>();
		nameMap.put(1, "Ajin");
		nameMap.put(9, "Tom");
		nameMap.put(5, "Jack");
		nameMap.put(25, "Sara");
		nameMap.put(3, "Mathew");
		nameMap.put(6, "Lin");
		nameMap.put(2, "Dan");
		
		Set<Integer> keys= nameMap.keySet();
		
		for(Integer key: keys)
			System.out.println(key+":"+nameMap.get(key));
		
		Set <Map.Entry<Integer, String>> values=nameMap.entrySet();
		for(Map.Entry<Integer, String> entry:values)
			System.out.println(entry.getKey()+":"+entry.getValue());

	}

}
