package com.cg.iter;

import java.util.*;

public class IncreasingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        String input = sc.nextLine();
        char arr[]=input.toCharArray();
        Arrays.sort(arr);
        String check = String.valueOf(arr);
        if(input.equals(check)){
            System.out.println("Its a increasing number");
        }
        else{
            System.out.println("Its a non increasing number");
        }
       
       
        
    }
}


