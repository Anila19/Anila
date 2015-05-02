package com.bayamp.interview.basic;

public class FactioralUsingIteration {

	public static void main(String[] args) {
		int number = 5;
		numberIteration(number);
	}

	private static void numberIteration(int num) {

		int result = 1;

		for (int i = 1; i <= num; i++) {
			result = result * i;
		}

		System.out.println("the result is:  " + result);
	}

}
