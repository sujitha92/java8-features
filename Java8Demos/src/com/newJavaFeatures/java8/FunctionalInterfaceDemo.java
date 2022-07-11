package com.newJavaFeatures.java8;
//A functional interface is an interface that contains only one abstract method.
//E.g. Comparable,Runnable interface

/*
 * In Functional interfaces, there is no need to use the abstract keyword
 * It is optional because, by default, the method defined inside the interface is abstract only. 
 * We can also call Lambda expressions as the instance of functional interface.
 * Before Java 8, we had to create anonymous inner class objects or implement these interfaces.
 */
public class FunctionalInterfaceDemo{

	public static void main(String[] args) {
		int a = 5;
		//without Lambda Expression
		
		//int ans = new FunctionalInterfaceDemo().calculate(a);
		
		// lambda expression to define the calculate method
		Square s = x ->x * x;

		// parameter passed and return type must be
		// same as defined in the prototype
		
		//int ans = new FunctionalInterfaceDemo().calculate(a);
		int ans=s.calculate(a);
		System.out.println(ans);

	}

	
	//public int calculate(int x) {
	//	return x*x;
	//}

}
//implement a user defined functional interface.
@FunctionalInterface
interface Square {
	int calculate(int x);
}
