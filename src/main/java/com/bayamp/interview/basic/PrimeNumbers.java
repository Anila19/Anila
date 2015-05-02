package com.bayamp.interview.basic;

public class PrimeNumbers {

	public static void main(String[] args) {
		int numbers = 6;

	 checkNumberPrimeareNot(numbers);
	}

	private static boolean checkNumberPrimeareNot(int number)

	{
		
		for(int i =2;i<= number;i++)
		{
			if(number%2 == 0)
			{
				System.out.println( number   +  "the number is not prime");
			}
			
			else
			{
				System.out.println(number +    "the number is prime");
			}
			break;
		}
		
		
return true;
		
	}
}
