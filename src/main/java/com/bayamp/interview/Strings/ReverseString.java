package com.bayamp.interview.Strings;

public class ReverseString {

	public static void main(String[] args) {
		String names = "anne,fernado,mathew,warren";
		String result = reverse(names);
		System.out.println(result);

	}

	public static String reverse(String names) {
		if (names == null)
			return null;
		String temp = "";
		String[] result = names.split(" ");
		for (int i = result.length - 1; i >= 0; i--) {
			temp += result[i] + " ";
		}

		return temp.trim();
	}

}

