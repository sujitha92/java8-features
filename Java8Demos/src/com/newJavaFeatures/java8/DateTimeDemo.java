package com.newJavaFeatures.java8;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

public class DateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date1 = LocalDate.now();	 
        LocalDate date2 =LocalDate.of(2020, 06, 10);
 
        Period gap = Period.between(date2, date1);
        
        System.out.println("Kia's Age :  "+gap);
        
        LocalDate date = LocalDate.now();
        System.out.println("the current date is "+
                            date);
 
        // to get the first day of next month
        LocalDate dayOfNextMonth =
              date.with(TemporalAdjusters.
                        firstDayOfNextMonth());
     
        System.out.println("firstDayOfNextMonth : " +
                            dayOfNextMonth );
        
        
        

	}

}
