package com.bayamp.interview.basic;

public class FibanociiSeries {
	public static void main(String[] main) {
		long n = 3;
		for (int i = 0; i <= n; i++)
			System.out.println(fibanociiseries(i) + "  ");

	}

	public static long fibanociiseries(long n) {

		if (n == 0)
			return 0;
		if (n <= 2)
			return 1;

		long fibterm = fibanociiseries(n - 1) + fibanociiseries(n - 2);
		return fibterm;

	}
}
