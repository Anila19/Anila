package com.bayamp.interview.Arrays;

public class CountingNumberOfCharacters {

	public static void main(String[] args) {

		String input = "hi how r u";
		char ch = 'h';
		charactersCounting(input, ch);

	}

	public static char charactersCounting(String input, char ch) {
		int charCount = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'h') {
				charCount++;
			}

		}

		System.out.println("count of character " + ch + "\n on String: "
				+ input + "using for each loop  " + charCount);

		return ch;
	}
}
