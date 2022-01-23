package com.noorteck.java.hw20;

public class Day20Question13 {
	
	public static void main (String[] args) {
		
/**
 * Write a method to check whether a given string starts with the contents(Characters) of
another string

Access Modifier: default
Non-Access Modifier: non-static
Return Type: boolean
Method Name: isStartWith
Parameter1: String strOne
Parameter2: String strTwo

Test Data:
isStartWith (“java training”, “ing”) ----- False
isStartWith (“java training”, “ja”) ----- TRUE
isStartWith (“java training”, “java”) ----- TRUE
isStartWith (“java training”, “train”) ----- False
 */
		
		Day20Question13 obj = new Day20Question13();
		
		boolean result = obj.isStartWith("java training", "ing");
		boolean resultOne = obj.isStartWith("java training","ja");
		boolean resultTwo = obj.isStartWith("java training", "java");
		boolean resultThree = obj.isStartWith("java training", "train");
		
		System.out.println(result);
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
	}
	
	boolean isStartWith(String strOne, String strTwo) {
		
		boolean result = false;
		
		result = strOne.startsWith(strTwo);
		
		return result;
	}

}
