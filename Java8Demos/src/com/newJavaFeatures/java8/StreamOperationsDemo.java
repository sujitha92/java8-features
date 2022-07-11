package com.newJavaFeatures.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.util.Employee;
import com.util.EmployeeDatabase;

public class StreamOperationsDemo {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,7,7,3,13,11);
		List<Employee> employees=EmployeeDatabase.getAll();
	
		
		/*
		 * Print the 3 highest element in list
		 */
		System.out.println("Third highest element in list...");
		list.stream().sorted(Comparator.reverseOrder()).limit(3).skip(2).forEach(System.out::println);;
		
		//System.out.println(integer);
		
		/*
		 * Print even numbers in a list
		 */
		System.out.println("Even Numbers....");
		list.stream().filter(n->n%2==0).forEach(System.out::println);
		
		/*
		 * Print the numbers starting with 1 
		 */
		System.out.println("Numbers starting with 1....");
		list.stream().map(n->n.toString()).filter(n->n.startsWith("1")).forEach(System.out::println);
		
		/*
		 *  first element of the list
		 */
		System.out.println("First element of the list....");
		list.stream().findFirst().ifPresent(System.out::println);
		
		/*
		 * total number of elements present in the list 
		 */
		System.out.println("Total number of elements present in the list.... ");
		System.out.println(list.stream().count());
		
		/*
		 * The maximum value element present
		 */
		System.out.println("The maximum value element present....");
		Integer max= list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		//Integer max= list.stream().max((o1,o2)->o1.compareTo(o2)).get();
		System.out.println(max);
		
		/*
		 *  Find Min or Max Object by Field Value
		 * 
		 *  Employee with max salary	
		 */
		System.out.println("Employee with max salary....");
		String employee = employees.stream().max(Comparator.comparing(Employee::getSalary)).map(e->e.getName()).get();
		System.out.println(employee);
		
		/*
		 * First repeated character in a string
		 */
		System.out.println("First repeated character in a string....");
		String str="java program";
		
		List<Character> chars=StreamOperationsDemo.convertStringToCharList(str);
		
		Set<Character> set=new HashSet<>();
		Character character = chars.stream().filter(c->!set.add(c)).findFirst().get();
		System.out.println(character);
		
		/*
		 * Sort the list in descending order
		 */
		System.out.println("list in descending order....");
		//list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
	}
	
	// Function to convert String to List of Characters
	public static List<Character> convertStringToCharList(String str)
	    {
	  
	      // Create an empty List of character
	      List<Character> chars = str
	  
	      // Convert to String to IntStream
	      .chars()
	  
	      // Convert IntStream to Stream<Character>
	      .mapToObj(e -> (char)e)
	  
	      // Collect the elements as a List Of Characters
	      .collect(Collectors.toList());
	  
	      // return the List
	      return chars;
	    }
	
	// Traditional Approach
    public static List<Character>
    convertStringToCharList2(String str)
    {
  
        // Create an empty List of character
        List<Character> chars = new ArrayList<>();
  
        // For each character in the String
        // add it to the List
        for (char ch : str.toCharArray()) {
  
            chars.add(ch);
        }
  
        // return the List
        return chars;
    }
  

}
