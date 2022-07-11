package com.newJavaFeatures.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

//A simple program to demonstrate the use of java 8 predefined functional interfaces
/*
 * Consumer Interface
 * void accept (T t)
 * 
 * Predicate Interface
 * boolean test(T t)
 * 
 * Supplier Interface
 * T get() 
 */
public class PredicateFunctionalInterfaceDemo {

	public static void main(String[] args) {
		// create a list of strings
		List<String> names = Arrays.asList(
			"Java", "Cobalt", "Python", "C", "Unix");

		System.out.println("Predicate Interface...");
		Predicate<String> p = (s) -> s.startsWith("J");
		
		// names.forEach(st->{if (p.test(st)) System.out.println(st);});
		 
		//using stream for predicate 
		names.stream().filter(p).forEach(s->System.out.println(s));;
		
		System.out.println("Consumer Interface..." );
		Consumer<String> c=(s)-> System.out.println(s);	
		//names.forEach(st->c.accept(st));
		
		//using streams for consumer interface
		names.stream().forEach(c);
		
		System.out.println("Supplier Interface...");
		Supplier<String> sup= ()-> "hi nothing here";
		//System.out.println(sup.get());
		
		//using stream
		System.out.println(names.stream().findAny().orElseGet(sup));

	}

}
