package com.newJavaFeatures.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.util.Employee;
import com.util.EmployeeDatabase;

/*
 * Program to find highest paid employee from each Department
 */
public class StreamGroupByDemo2 {

	public static void main(String[] args) {
	
		List<Employee> list=EmployeeDatabase.getAll();
		
		Comparator<Employee> compareBySalary=Comparator.comparing(Employee::getSalary);
		
		Map<String, Optional<Employee>> empMap=list.stream().
				collect(Collectors.groupingBy(e->e.getDepartmentName(),Collectors.maxBy(compareBySalary)));
		
		
		System.out.println(empMap);
		
		

	}

}
