package com.bayamp.interview.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int[] search = { 12, 23, 45, 67, 78 };
		int key = 23;

		linearsearch(search, key);
	}

	private static void linearsearch(int[] search, int key) {
		for (int i = 0; i < search.length - 1; i++)

			if (search[i] == key)
				System.out.println("the key found at index" + i);

			else
				System.out.println("the key doesn'tfound");

	}

}
