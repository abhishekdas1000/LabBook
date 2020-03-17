package com.cg.bbsr;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise5 {

	public static void main(String[] args) {
		int arr[]= {19,5,1,7,3,8,10,6};
        int output =getSecondSmallest(arr);
        
        
     
        //print the sorted values List
        System.out.println("Second Smallest Element : "+output);
    }
	private static int getSecondSmallest(int[] arr) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		Collections.sort(list);
		//System.out.println(list);
		return list.get(1);
		
	}

	
    
}