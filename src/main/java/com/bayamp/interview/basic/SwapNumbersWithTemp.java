package com.bayamp.interview.basic;

public class SwapNumbersWithTemp {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		swapNumbers(a, b);

		int x = 40;
		int y = 50;
		swapNumbersWithTemp(x, y);
	}

	private static void swapNumbers(int a, int b) {

		System.out.println("the value of x before swap" + a);
		System.out.println("the value of y before swap" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("thw value of x after swap" + a);
		System.out.println("the value of  y after swap" + b);

	}

	private static void swapNumbersWithTemp(int a, int b) {
		System.out.println("the value of a before swap" + a);
		System.out.println("the value of b brfore swap " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("the value of a after swap " + a);
		System.out.println("ht value of b after swap " + b);

	}
}
