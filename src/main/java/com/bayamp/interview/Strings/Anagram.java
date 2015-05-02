package com.bayamp.interview.Strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String firstword = "Listen";
		String secondword = "silent";
		boolean result = isAnagram(firstword, secondword);
		System.out.println(result);
	}

	public static boolean isAnagram(String names, String names1) {
		char[] firstword = names.toLowerCase().replaceAll("\\s+", "")
				.toCharArray();
		char[] secondword = names1.toLowerCase().replaceAll("\\s+", "")
				.toCharArray();
		Arrays.sort(firstword);
		Arrays.sort(secondword);
		return Arrays.equals(firstword, secondword);

	}
}
