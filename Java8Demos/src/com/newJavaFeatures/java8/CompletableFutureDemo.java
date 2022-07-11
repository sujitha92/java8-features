package com.newJavaFeatures.java8;

import java.util.concurrent.CompletableFuture;

/*
 * To print even and odd number using 2 threads
 */
public class CompletableFutureDemo {
	
	private static Object object=new Object();
	private static int i=1;

	public static void main(String[] args) throws InterruptedException {	
		
		for(i=1;i<=10;i++) {
			
			if(i%2==0)
				CompletableFuture.runAsync(()->CompletableFutureDemo.execute(i));
				else
				CompletableFuture.runAsync(()->CompletableFutureDemo.execute(i));
			
			Thread.sleep(1000);
		}	

	}
	
	public static void execute(int no) {
		synchronized (object) {
			System.out.println(Thread.currentThread().getName()+" : "+no);
			object.notify();
			try {
				object.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
