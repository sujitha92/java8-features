package com.newJavaFeatures.java8;

import java.util.List;
import java.util.stream.Collectors;

import com.util.Customer;
import com.util.CustomerDatabase;

/*
 * map() and flatmap()
 * intermediate methods and returns another method as o/p
 * map - transformation
 * flatMap - map() + flattering
 */

public class MapvsFlatMap {

	public static void main(String[] args) {
		
		List<Customer> customers=CustomerDatabase.getAll();
		
		/*
		 * map() --> Stream<T> --> Stream<T>
		 * one to one mapping
		 * 
		 * E.g. Convert List<Customer> to List<String>
		 */
		System.out.println("Map Demo...");
		List<String> name=customers.stream()
				.map(Customer::getName)
				.collect(Collectors.toList());
		System.out.println(name);

		/*
		 * flatMap() --> Stream<Stream<T>> --> Stream<T>
		 * one to many mapping
		 * 
		 * E.g. Convert List<List<String>> to  List<String>
		 */
		System.out.println("flatMap Demo...");
		List<String> phoneNumbers=customers.stream()
				.flatMap(customer->customer.getPhone().stream())
				.collect(Collectors.toList());
		System.out.println(phoneNumbers);
	}

}
