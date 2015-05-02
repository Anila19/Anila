package com.bayamp.interview.Arrays;

import java.util.Arrays;

/*@ author anila created on 4/22/15
 * here i had used arraycopy method to add 2 unsorted arrays
 * 
 * syntax of method is
 * 
 * 
 * arrycopy(source,sourceposition,destination,destinationposition,length)
 * 
 */

public class MergedArray {

	public static void main(String[] args) {

		int[] usedcars = { 12, 24, 35, 36 };
		int[] newcars = { 23, 34, 56, 67, 56, 78, 89 };
		int[] concate = combine(usedcars, newcars);
		System.out.println(" concate array :" + Arrays.toString(concate));
		String[] alphabets = { "a", "b", "c", "d" };
		String[] alphabets1 = { "e", "f", "g", "h" };

		String[] combine = add(alphabets, alphabets1);
		System.out.println("combine array :" + Arrays.toString(combine));
		int[] class1 = { 12, 13, 14, 15 };
		int[] class2 = { 21, 22, 34, 45 };
		int[] result = addtwoArrays(class1, class2);

		System.out.println(Arrays.toString(result));

	}

	private static int[] combine(int[] usedcars, int[] newcars) {

		int length = usedcars.length + newcars.length;
		int[] result = new int[length];
		System.arraycopy(usedcars, 0, result, 0, usedcars.length);
		System.arraycopy(newcars, 0, result, usedcars.length, newcars.length);
		return result;
	}

	private static String[] add(String[] alphabets, String[] alphabets1) {

		int length = alphabets.length + alphabets1.length;
		String[] result = new String[length];
		System.arraycopy(alphabets, 0, result, 0, alphabets.length);
		System.arraycopy(alphabets1, 0, result, alphabets.length,
				alphabets1.length);
		return result;

	}

	private static int[] addtwoArrays(int[] class1, int[] class2) {
		int length = class1.length + class2.length;
		int[] size = new int[length];
		for (int i = 0; i < class1.length; i++)
			size[i] = class1[i] + class2[i];
		return size;
	}

}