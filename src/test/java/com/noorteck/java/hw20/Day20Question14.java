package com.noorteck.java.hw20;

public class Day20Question14 {
	public static void main (String[] args) {
		
/**
     Write a method to get a substring of a given string between two specified positions.

Access Modifier: public
Non-Access Modifier: static
Return Type: String
Method Name: getSubStr
Parameter1: String str
Parameter2: Int startingIndex
Parameter2: Int endingIndex

Test Data:
getSubStr (“java training”, 2 ,6) ----- v at
getSubStr (“Software Development Engineer in TEST”, 11, 23) ----- velopment En
getSubStr (“Software Development Engineer in TEST”, 21, 29) ----- Engineer
 */
		
		String result = getSubStr("java training", 2, 6);
		String resultOne = getSubStr("Software Development Engineer in TEST", 11, 23);
		String resultTwo = getSubStr("Software Development Engineer in TEST", 21, 29);
		
		System.out.println(result);
		System.out.println(resultOne);
		System.out.println(resultTwo);
	}
	
	public static String getSubStr (String str, int startingIndex, int endingIndex) {
		 
		String result = " ";
		
		result = str.substring(startingIndex, endingIndex);
		
		
		return result;
	}
}
