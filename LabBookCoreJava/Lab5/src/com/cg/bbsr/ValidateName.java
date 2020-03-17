package com.cg.bbsr;

import java.util.Scanner;

class MyException extends Exception
{
	String s1;
	public MyException(String s2) {
		 s1 = s2;	
	}
	@Override
	   public String toString() { 
	      return (s1);
	   }
}
public class ValidateName {
	
	   public static void main( String[] args ) throws MyException {

		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter first Name");
		   String fName=sc.nextLine();
		   System.out.println("Enter last Name");
		   String lName=sc.nextLine();
		   
	   try
	   {
		   if((fName.matches( "[A-Z][a-z]*" ))&&(lName.matches( "[A-Z]+([a-zA-Z]+)*" )))
			   System.out.println("Valid name");
		   else if(fName.matches("[^$]")&&(lName.matches( "[^$]" )))
				   {
			   throw new MyException("Name must not be blank");
				   }
		   else 
		   {
			   throw new MyException("Invalid name");
		   }
	   }
	   catch(MyException e)
	   {
		   System.out.println(e);
	   }
	}
}
