package com.bayamp.interview.Strings;

public class CalculatingLengthOfString {
	static int i;
	static int c=0;

	public static void main(String[] args) {
		String names = "hi how r u";
		int res = withOutUsingLength(names);
		System.out.println(res);
	}

	@SuppressWarnings("finally")
	public static int withOutUsingLength(String names) {

		try {
			for (i = 0; 0 <= i; i++){
				names.charAt(i);
				c++;
			}
		} catch (Exception e) {
			return c;
		}finally{
			return c;
		}
	}
}