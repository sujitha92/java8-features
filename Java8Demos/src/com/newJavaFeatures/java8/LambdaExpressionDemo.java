package com.newJavaFeatures.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//comparable demo
class Student {
	int rollno,age;
    String name;
 
    // Constructor
    public Student(int rollno, String name, int age)
    {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}
public class LambdaExpressionDemo {

	public static void main(String[] args) {
		List<Student> ls= new ArrayList<>();
		ls.add(new Student(3, "john", 21));
		ls.add(new Student(1, "jane", 22));
		ls.add(new Student(2, "tom", 24));
		
		//implementation of compareto method made simple using lambda expression
		Collections.sort(ls,((o1,o2)->o1.rollno-o2.rollno));
		
		System.out.println("After sorting..");
		ls.forEach(stObject -> System.out.println(stObject.name));
		
		System.out.println();
	}

}
