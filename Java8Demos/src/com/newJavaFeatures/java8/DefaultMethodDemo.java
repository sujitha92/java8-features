package com.newJavaFeatures.java8;

//demonstrate multiple inheritance through default methods.
interface TestInterface1
{
    // abstract method
    public void square(int a);
  
    // default method
    default void show()
    {
      System.out.println("Default Interface 1 Executed");
    }
    //static method
    static void m1() {
    	System.out.println("static method executed...");
    }
}

interface TestInterface2
{
    // abstract method
    public void square(int a);
  
    // default method
    default void show()
    {
      System.out.println("Default Interface 2 Executed");
    }

}

public class DefaultMethodDemo implements TestInterface1,TestInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		DefaultMethodDemo d = new DefaultMethodDemo();
        d.square(4);
  
        // default method executed
        d.show();
        TestInterface1.m1();
        
	}

	@Override
	public void square(int a) {
		System.out.println(a*a);
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		TestInterface1.super.show();
		
		TestInterface2.super.show();
		
	}

}
