package com.newJavaFeatures.java8;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
	
	public static void printElements(int i) {
		System.out.println(i);
	}
	
	public void printElements2(int i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,4,3,2);
		
		//static method reference
		list.stream().forEach(MethodReferenceDemo::printElements);
		
		MethodReferenceDemo demo=new MethodReferenceDemo();
		
		//non static method reference
		list.stream().forEach(demo::printElements2);

	}

}
