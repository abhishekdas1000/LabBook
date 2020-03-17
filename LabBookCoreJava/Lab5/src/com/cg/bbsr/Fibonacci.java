package com.cg.bbsr;

import java.util.Scanner;
/*Recursive Solution*/
class Fibonacci { 
	int n;

    static int fib(int n) 
    { 
    	if(n == 0){
    		return 0;
    	}
    	if(n == 1 || n == 2){
    			return 1;
    		}
    	return fib(n-2) + fib(n-1);
    }
    
  
    public static void main(String args[]) 
    { 
        
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter value of n:");
    	int n=sc.nextInt();
        
        System.out.print("Fibonacci Series of "+n+" numbers: ");
    	for(int i = 1; i < n; i++){
    			System.out.print(fib(i) +" ");
    		}
    	System.out.println();
    	System.out.println(n+"th value of the series is: "+fib(n)); 
    } 
} 