package com.noorteck.java.hw20;

public class Day20Question11 {
	
	public static void main(String[] args) {
		
/**
 * Write a method that takes three parameters. One String parameter, 2 character
parameters. The method replaces old character (parameter 2) from String parameter
with new character (parameter 3) and returns the new string

Access Modifier: protected
Non-Access Modifier: non-static
Return Type: String
Method Name: threeEqual
Parameter1: String str
Parameter2: char oldChar
Parameter3: char newChar

Test Data:
threeEqual (“Java Pro”, ’P’, ‘B‘) ----- Java Bro
threeEqual (“Lazy mode”, ‘m‘, ‘C‘) ----- Lazy Cod
threeEqual (“Training”, ‘T’, ‘ ‘) ----- raining
 */
		
		Day20Question11 obj = new Day20Question11();
		String result = obj.threeEqual("Java Pro", 'P', 'B');
		String resultOne = obj.threeEqual("Lazy mode", 'm', 'C');
		String resultTwo = obj.threeEqual("Training", 'T', ' ');
		
		System.out.println(result);
		System.out.println(resultOne);
		System.out.println(resultTwo);
	}
	
	
	protected String threeEqual(String str, char oldChar, char newChar) {
	
		String result = " ";
		
		result = str.replace(oldChar, newChar);
		
		
		return result;
	}
	
	

}
