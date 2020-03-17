package com.cg.bbsr;

import java.util.Scanner;

class AgeException extends Exception {
 
	String s1;
	public AgeException(String s2) {
		 s1 = s2;	
	}
	@Override
	   public String toString() { 
	      return (s1);
	   }
}
public class ValidateAge {
 
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter age ");
  int age = sc.nextInt();
  
  try {
   if(age < 15) 
    throw new AgeException("Invalid age");
   else
    System.out.println("Valid age");
  }
  catch (AgeException a) {
   System.out.println(a);
  }
 }
}