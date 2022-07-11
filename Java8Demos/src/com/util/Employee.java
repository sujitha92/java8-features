package com.util;

public class Employee {
	private String name;
	private String salary;
	private String DepartmentName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getDepartmentName() {
		return DepartmentName;
	}
	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}
	public Employee(String name, String salary, String departmentName) {
		super();
		this.name = name;
		this.salary = salary;
		DepartmentName = departmentName;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", DepartmentName=" + DepartmentName + "]";
	}
	
	
	
}
