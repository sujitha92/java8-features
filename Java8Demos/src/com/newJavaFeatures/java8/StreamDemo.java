package com.newJavaFeatures.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo{

	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("Kia","Sujitha","Pradeep","Sheba","Aravind");
		
		/*
		 * INTERMEDIATE OPERARTIONS
		 */
		//1. filter
		System.out.println("filter demo...");	
		list.stream().filter((str)->str.startsWith("K")).forEach((str)->System.out.println(str));
		
		//2. sorted
		System.out.println("sorted demo...ascending");
		//ascending
		list.stream().sorted().forEach((str)->System.out.println(str));
		//descending
		System.out.println("sorted demo...descending");
		list.stream().sorted(Comparator.reverseOrder()).forEach((str)->System.out.println(str));
		
		/*
		 * TERMINAL OPERATIONS
		 */
		//1. forEach
		System.out.println("forEach demo...");	
		list.stream().forEach((str)->System.out.println(str));
		
		//2. collect
		System.out.println("collect demo...");	
		list.stream().filter((str)->str.startsWith("S")).collect(Collectors.toSet()).forEach((str)->System.out.println(str));;
		
		//3. reduce
		System.out.println("reduce demo...");	
		List<Integer> number = Arrays.asList(2,3,4,5);
		int even = number.stream().reduce(0,(ans,i)-> ans+i);
		System.out.println(even);
			
	}

}
