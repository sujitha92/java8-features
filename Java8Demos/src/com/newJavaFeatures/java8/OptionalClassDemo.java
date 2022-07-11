package com.newJavaFeatures.java8;

import java.util.Arrays;
import java.util.Optional;

import com.util.Customer;

/*
 * To avoid unpredictable Exceptions
 * 
 * public final class Optional <T>
 * 
 */
public class OptionalClassDemo {

	public static void main(String[] args) {
		Customer c=new Customer(1, "john", null, Arrays.asList("1231","32124"));
		
		/*
		 * E.g. Methods to check NPE
		 * 
		 * empty -->return empty optional object
		 * of --> does null check and throws NPE
		 * ofNullable --> if(null) empty() else of(value)
		 */
		
		System.out.println(Optional.empty());
		//System.out.println(Optional.of(c.getEmail()));
		System.out.println(Optional.ofNullable(c.getEmail()));
		
		/*
		 * to return a meaningful default message instead of empty optional object
		 * 
		 * orElse
		 * orElseGet
		 * orElseThrow
		 */
		System.out.println(Optional.ofNullable(c.getEmail())
				.orElse("default"));
		System.out.println(Optional.ofNullable(c.getName())
				.map(String::toUpperCase)
				.orElse("default"));
		

		
		//using streams
		
	}

}
