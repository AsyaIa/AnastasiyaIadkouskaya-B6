package com.noorteck.java.hw20;

public class Day20Question15 {
	
/**
 Write a method to trim any leading or trailing whitespace from a given string

Access Modifier: public
Non-Access Modifier: static
Return Type: String
Method Name: removeSpace
Parameter1: String strOne

Test Data:
removeSpace (“ Java Training ”) ----- java Training
removeSpace (“ I like to practice ”) ----- I like to practice
 */
	
	public static void main (String[] args) {
		
		String result = removeSpace("  java Training       ");
		String resultOne = removeSpace("      I like to practice      ");
		
		System.out.println(result);
		System.out.println(resultOne);
	}
	

	public static String removeSpace(String strOne) {
		
		String result = " ";
		 
		result = strOne.trim();
		
		return result;
	}

}
