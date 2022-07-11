package com.newJavaFeatures.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Program to print the duplicate elements in a list
 */
public class DuplicatesDemo {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,2,3,4,5,3,3,1,1);
		
		Set<Integer> dupSet=new HashSet<>();
		
		/*
		 * add method returns boolean 
		 * by negating it we can get elements which are not added to the set i.e duplicates 
		 *
		 * without .distinct() we ll get every repeated element which is not added to set.
		 */
		list.stream().filter(p->!dupSet.add(p)).distinct().forEach(System.out::println);
		
		

	}

}
