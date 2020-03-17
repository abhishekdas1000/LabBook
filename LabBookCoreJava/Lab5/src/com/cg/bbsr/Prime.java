package com.cg.bbsr;

import java.util.Scanner;

class Prime
{
	public static void main(String[] args)
	{
		int number;
		int p;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		number=s.nextInt();
		System.out.println("Prime Numbers upto "+number+" are ");
		for(int i=2;i<number;i++)
		{
			p=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				p=1;
			}
			if(p==0)
				System.out.println(i);
		}
	}
}
