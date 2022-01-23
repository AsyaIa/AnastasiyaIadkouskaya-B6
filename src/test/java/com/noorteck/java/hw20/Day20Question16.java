package com.noorteck.java.hw20;

public class Day20Question16 {
	
/**
Write a method to concatenate two given strings such that, if the concatenation creates
a double characters then removes one of the characters.
a. For example strOne = “food”; strTwo =”door”. After concatenating two
strings it will give us “fooddoor”(dd is double character, remove one of the
d) then the string after concatenation are: “foodoor”

Access Modifier: default
Non-Access Modifier: non-static
Return Type: String
Method Name: concatString
Parameter1: String strOne
Parameter2: String strTwo

Test Data:
concatString (“Java”, “awesome”) ----- javawesome
concatString (“food”, “door”) ----- foodoor
concatString (“java”, “training”) ----- javatraining
concatString (“Pro”, “ogress”) ----- Progress
 */
	
	public static void main(String[] args) {
		Day20Question16 obj = new Day20Question16();
		String result = obj.concatString("Java", "awesome");
		String resultOne = obj.concatString("food", "door");
		String resultTwo = obj.concatString("java", "training");
		String resultThree = obj.concatString("Pro", "ogress");
		
		System.out.println(result);
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
	}
	
	String concatString(String strOne, String strTwo) {
		
		String result = " ";
		
		int a = strOne.length() - 1;
		
		String b = strOne.substring(0, a);
		
		if (strOne.charAt(a) == strTwo.charAt(0)) {
			result = b.concat(strTwo);
			
		} else {
			result = strOne.concat(strTwo);
			
		}
		
		return result;
	}

}
