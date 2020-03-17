package com.cg.bbsr;

import java.util.Scanner;

public class Exercise3 {
	// Function to reverse a string in Java using StringBuilder
		public static String getImage(String s) {
			return new StringBuilder(s).reverse().toString();
		}

		public static void main(String[] args) {
			String str;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string-");
			str = sc.nextLine();
			String temp=str;
			str = getImage(str);
			String str2= temp+ '|'+str;
			System.out.println("Output : " + str2);
		}
}
