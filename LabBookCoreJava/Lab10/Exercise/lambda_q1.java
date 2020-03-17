package com.cg.iter.exercise;
import java.util.function.*;
import java.util.Scanner;

public class lambda_q1 {

	public static void main(String[] args) {
		new lambda_q1();
	}

	public lambda_q1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x :");
		int x = sc.nextInt();
		System.out.println("Enter the value of y :");
		int y = sc.nextInt();
		BiFunction <Integer,Integer,Integer>fn = (a,b)-> (int)Math.pow(a, b);
		System.out.println("x^y = "+fn.apply(x, y));
	}

}
