package com.cg.bbsr;

/*Non Recursive Solution*/
import java.util.Scanner;
class Fib {
	public static void main(String args[ ]) {
		Scanner sc=new Scanner(System.in);
		int i,a=1,b=1,c=0,n;
		System.out.println("Enter value of n:");
		n=sc.nextInt();
		System.out.print(a);
		System.out.print(" "+b);
		for(i=0;i<n-2;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
		System.out.println();
		System.out.print(n+"th value of the series is: "+c);
	}
}