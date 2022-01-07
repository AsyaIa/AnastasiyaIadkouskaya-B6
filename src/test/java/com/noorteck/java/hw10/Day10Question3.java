package com.noorteck.java.hw10;

public class Day10Question3 {
	public static void main(String[] args) {
		// this is my day 10 homework for q3...

		oddEven(5);

	}

	public static void oddEven(int number) {

		if (number % 2 == 0) {
			System.out.println(number + " is an even number");
		} else if (number % 2 == 1) {
			System.out.println(number + " is an odd number");
		}
	}

}