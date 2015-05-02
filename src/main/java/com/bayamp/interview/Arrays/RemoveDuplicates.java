package com.bayamp.interview.Arrays;

import java.util.Arrays;

public class RemoveDuplicates {
	
	public static void main(String[] args)
	{
		int[] arr = {2,4,5,6,2,8,9};
		int [] removed = removingDuplicates( arr);
		System.out.println("  the original array is :  "  +Arrays.toString
				 (removed) );
	}

	
	public static int[] removingDuplicates(int[] arr)
	{
		
		 int end = arr.length;

		    for(int i = 0; i < end; i++){
		        for(int j = i + 1; j < end; j++){
		            if(arr[i] == arr[j]){                  
		                int shiftLeft = j;
		                for(int k = j+1; k < end; k++, shiftLeft++){
		                    arr[shiftLeft] = arr[k];
		                }
		                end--;
		                j--;
		            }
		        }
		    }

		    int[] whitelist = new int[end];
		    for(int i = 0; i < end; i++){
		        whitelist[i] = arr[i];
		    }
		    return whitelist;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}