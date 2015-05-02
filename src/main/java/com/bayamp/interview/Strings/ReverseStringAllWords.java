package com.bayamp.interview.Strings;

public class ReverseStringAllWords {
	
	public static void main(String[] args)
	{
		String placses = "freemont,sfo,sunnyvale,santaclara";
		String total = reverse(placses);
		System.out.println(total);
	}

	
	public static String reverse(String placses)
	
	{
		StringBuffer bf = new StringBuffer(placses);
		bf.reverse();
		System.out.println(bf);
		
		return placses;
	}
}
