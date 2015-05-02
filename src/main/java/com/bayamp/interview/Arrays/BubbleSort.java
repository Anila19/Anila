package com.bayamp.interview.Arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] housenumbers = { 30, 10, 80, 12, 54, 23, 56, 1 };
		bubbleSort(housenumbers);
	}

	public static void bubbleSort(int[] housenumbers) {
		int temp;
		boolean fixed = false;
		while (fixed == false) {
			fixed = true;

			for (int i = 0; i < housenumbers.length - 1; i++) {
				if (housenumbers[i] > housenumbers[i + 1]) {
					temp = housenumbers[i + 1];
					housenumbers[i + 1] = housenumbers[i];
					housenumbers[i] = temp;

					fixed = false;
				}
			}
		}
		for (int i = 0; i < housenumbers.length; i++)
			System.out.println(housenumbers[i]);
	}
}
