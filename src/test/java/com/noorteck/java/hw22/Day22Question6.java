package com.noorteck.java.hw22;

public class Day22Question6 {
	
/**
 Write a method that takes a string parameter and return true if the string parameter
ends in "ng"

Access Modifier: public
Non-Access Modifier: non-static
Return Type: boolean
Method Name: endsWithNG
Parameter1: String strOne

Test Data:
endsWithNG (null) ----- FALSE
endsWithNG (“I like to practice”) ----- FALSE
endsWithNG (“Everyone is practicing”) ----- TRUE
endsWithNG (“I am studying”) ----- TRUE
 */
	
	public static void main (String[] args) {
		
		Day22Question6 obj = new Day22Question6();
		boolean resultOne = obj.endsWithNG(null);
		boolean resultTwo = obj.endsWithNG("I like to practice");
		boolean resultThree = obj.endsWithNG("Everyone is practicing");
		boolean resultFour = obj.endsWithNG("I am studying");
		
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);
		
	}
	
	public boolean endsWithNG (String strOne) {
		
		boolean result = false;
		
		if (strOne != null && strOne.endsWith("ng")) {
			
			result = true;
		}
		
		
		return result;
		
	}

}
