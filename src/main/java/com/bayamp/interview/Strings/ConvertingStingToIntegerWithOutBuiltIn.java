package com.bayamp.interview.Strings;

public class ConvertingStingToIntegerWithOutBuiltIn {
  public static void main(String[] args)
  {
	  long i = myStringToInteger("12346");
	    System.out.println("String decoded to number " + i);
	    System.out.println(("12346".charAt(0) - '0')*1);
  } 
  
  
  public static long myStringToInteger(String str) {
	    long answer = 0, factor = 1;
	    for (int i = str.length()-1; i >= 0; i--) {
	        answer += (str.charAt(i) - '0') * factor;
	        factor *= 10;
	    }
	    return answer;
	}
}
