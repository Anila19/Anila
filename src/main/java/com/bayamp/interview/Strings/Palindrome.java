package com.bayamp.interview.Strings;

public class Palindrome {

	public static void main(String[] args) {
		String alphabets = new String("abcba");
		boolean result = number(alphabets);

	}

	public static boolean number(String alphabets) {
		StringBuffer bf = new StringBuffer(alphabets);
		bf.reverse();
		System.out.println(alphabets);
		System.out.println(bf);
		if (alphabets.equals(bf.toString())) {

			System.out.println("this is palindrome");
			return true;
		} else {
			System.out.println("this is not palindrome");
		}
		return true;

	}
}
