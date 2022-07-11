package com.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDatabase {
	public static List<Customer> getAll(){
		return Stream.of(new Customer(1, "john", "john@gmail.com", Arrays.asList("99629","51962")),
				new Customer(2, "smith", "smith@gmail.com", Arrays.asList("99620","82517")))
				.collect(Collectors.toList());
	}
}
