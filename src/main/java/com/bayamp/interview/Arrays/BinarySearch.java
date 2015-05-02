package com.bayamp.interview.Arrays;

import java.util.Arrays;

import com.bayamp.interview.Arrays.*;

public class BinarySearch {

	public static void main(String[] args) {
		int[] numbers = { 89, 56, 98, 76, 54, 2, 90, 1 };
		int id = 76;
		BubbleSort.bubbleSort(numbers);

		int result = search(numbers, id);
		System.out.println(id
				+ ((result == 1) ? "is not in array"
						: ("is at index  " + result)));

	}

	public static int search(int[] numbers, int id) {
		int high = numbers.length - 1;

		int low = 0;
		int middle;

		while (high >= low) {
			middle =  (low + high) / 2;
			if (numbers[middle] > id)
				high = middle - 1;
			else if (numbers[middle] < id)
				low = middle + 1;

			else
				return middle;

		}

		return -1;// key not found
	}

}
