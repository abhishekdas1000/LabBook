package com.cg.iter.exercise;
import java.util.function.*;

import java.util.Scanner;

public class lambda_q2 {

	public static void main(String[] args) {
		new lambda_q2();
	}

	public lambda_q2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s = sc.nextLine();
		Function<String,String> fn = str->str.replaceAll("", " ").trim();
		System.out.println(fn.apply(s));
	}

}
