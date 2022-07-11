package com.newJavaFeatures.java8;

import java.util.stream.IntStream;

public class StreamOperationsDemo2 {

	public static void main(String[] args) {
		
		int number=6;
		isPrime(number);
				
	}
	/*
	 * To Check if number prime or not
	 */
	public static void isPrime(int number) {
		boolean isPrime = IntStream.range(2, number).noneMatch(i->number%i==0);
		System.out.println("Number is prime? "+isPrime);
	}

}
