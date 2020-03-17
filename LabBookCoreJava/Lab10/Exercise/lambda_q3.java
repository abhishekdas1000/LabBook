package com.cg.iter.exercise;

import java.util.Scanner;
import java.util.function.*;

public class lambda_q3 {

	public static void main(String[] args) {
		new lambda_q3();
	}

	public lambda_q3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Name:");
		String user = sc.nextLine();
		System.out.println("Enter Password:");
		String pass = sc.nextLine();
		BiFunction<String,String,Boolean> fn = (a,b) -> a.equals("iter") && b.equals("iter") ? true:false;
		if(fn.apply(user,pass))System.out.println("Welcome");
		else
		System.out.println("Incorrect Id or Password");
	}

}
