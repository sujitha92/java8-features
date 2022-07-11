package com.util;

import java.util.Arrays;
import java.util.List;

public class EmployeeDatabase {

	public static List<Employee> getAll(){
		 return Arrays.asList(new Employee("john", "50000", "IT"),
				 				new Employee("jack", "40000", "Admin"),
				 				new Employee("jill", "510000", "IT"),
				 				new Employee("smith", "41000", "Admin"),
				 				new Employee("jame", "42000", "Admin")
				 			);
		
	}

}
