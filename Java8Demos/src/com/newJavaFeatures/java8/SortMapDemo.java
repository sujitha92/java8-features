package com.newJavaFeatures.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapDemo {

	public static void main(String[] args) {
		
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(2, "two");
		map.put(3, "three");
		map.put(1, "one");
		
		//convert to list so that it can be used in collections.sort method
		List<Entry<Integer,String>> entries=new ArrayList<>(map.entrySet());
		
		//1. traditional approach to sort a hashmap
		System.out.println("MapSort Demo 1....");		
//		Collections.sort(entries,new Comparator<Entry<Integer,String>>() {
//
//			@Override
//			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
//				// TODO Auto-generated method stub
//				return o1.getKey().compareTo(o2.getKey());
//			}
//		});
//		
//		for(Entry<Integer, String> entry: entries) {
//			System.out.println(entry.getValue());
//		}
		
		//2. using lambda expression
		System.out.println("Map Sort Demo 2....");
//		Collections.sort(entries, (o1,o2)->o1.getKey().compareTo(o2.getKey()));
//		entries.stream().forEach(e->System.out.println(e.getValue()));
		
		//3. Using stream api
		System.out.println("Map Sort Demo 3 ...");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(e->System.out.println(e.getValue()));
	}

}
