package com.bayamp.interview.basic;

public class FactioralUsingRecursion {
	
	
	public static void main(String args[])
	{
		int n = 5;
		int recursion = factRecursion( n);
		System.out.println("the factioral of n is :  "  +recursion);
	}
	
	
	private static int factRecursion(int n)
	{
		
		if(n==0){
			return 1;
		}else{
			return n*factRecursion (n-1);
		}
	}

}
