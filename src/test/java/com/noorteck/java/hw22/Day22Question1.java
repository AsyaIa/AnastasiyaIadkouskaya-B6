package com.noorteck.java.hw22;

public class Day22Question1 {
	
/**
 Write a method that takes one String parameter and the method converts the
parameter to uppercase and return the new String value

Access Modifier: default
Non-Access Modifier: non-static
Return Type: String
Method Name: toUpper
Parameter1: String strOne

Test Data:
toUpper (“Pro”) ----- PRO
toUpper (“java”) ----- LEARNING
toUpper (null) ----- null
 
 */

	public static void main(String[] args) {

		Day22Question1 obj = new Day22Question1();

		String resultOne = obj.toUpper("Pro");
		String resultTwo = obj.toUpper("java");
		String resultThree = obj.toUpper(null);

		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);

	}

	String toUpper(String strOne) {

		String result = " ";

		if (strOne != null) {
			result = strOne.toUpperCase();
		} else {
			result = null;
		}

		return result;
	}

}
