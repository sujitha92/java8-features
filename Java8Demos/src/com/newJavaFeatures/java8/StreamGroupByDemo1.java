package com.newJavaFeatures.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Write a program to find the frequency of each character in a given String
 */
public class StreamGroupByDemo1 {

	public static void main(String[] args) {
		
		String str1="kiara";
		
		List<String> list=Arrays.asList(str1.split(""));
		Map<String,Long> map=list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(map);
		
		/*
		 * Find the first non repeated character in a word
		 * 
		 * here first non repeated character is u
		 * 
		 * Use LinkedHashMap to store the character count
		 * 
		 * This HashMap follows the order of the insertion.
		 *  
		 * choose the required entry with the value of 1. 
		 * 
		 */
		String str="turtle";
		List<String> strs=Arrays.asList(str.split(""));	
		String string = strs.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
								.entrySet().stream().filter(entry->entry.getValue()==1)
								.map(entry->entry.getKey()).findFirst().get();
		
		
		System.out.println("First non repeated charater is : "+string);
		
		
		
	}

}
