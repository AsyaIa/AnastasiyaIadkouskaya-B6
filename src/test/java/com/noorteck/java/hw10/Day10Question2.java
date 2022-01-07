package com.noorteck.java.hw10;

public class Day10Question2 {
	public static void main(String[] args) {
		// this is my day 10 homework for q2...

		getGender('B');
	}

	public static void getGender(char gender) {

		if (gender == 'M' || gender == 'm') {
			System.out.println("Male");
		} else if (gender == 'F' || gender == 'f') {
			System.out.println("Female");
		} else {
			System.out.println("Error message");
		}

	}

}
