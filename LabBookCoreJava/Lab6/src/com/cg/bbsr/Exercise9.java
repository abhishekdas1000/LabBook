package com.cg.bbsr;

import java.util.Calendar;

public class Exercise9 {
	public static void main(String[] args)
    {
       // Create a default calendar
        Calendar cal = Calendar.getInstance();
       // Get and display information of current date from the calendar:
        System.out.println("Day: " + cal.get(Calendar.DATE));
        System.out.println("Month: " + cal.get(Calendar.MONTH));
        System.out.println("Year: " + cal.get(Calendar.YEAR));
    }
}
