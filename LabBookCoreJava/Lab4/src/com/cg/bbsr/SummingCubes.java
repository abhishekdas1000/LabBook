package com.cg.bbsr;

import java.util.Scanner;

public class SummingCubes {
	public static int cube(int n) {
		int sum=0;
		while(n>0) {
			int temp=n%10;
			sum+=temp*temp*temp;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[]args) {
		System.out.println(cube(123));
	}
}
