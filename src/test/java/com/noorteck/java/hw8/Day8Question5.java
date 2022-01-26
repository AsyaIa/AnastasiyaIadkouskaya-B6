package com.noorteck.java.hw8;

public class Day8Question5 {

	public static void main(String[] args) {

		for (int i = 0; i <= 32; i++) {

			if (i % 2 == 0 && 2 <= i && i <= 5) {
				System.out.println("Even number: " + i);

			} else if (i % 2 == 0 && 6 <= i && i <= 20) {
				System.out.println("Even number: " + i);

			} else if (i % 2 == 1 && 15 <= i && i <= 20) {
				System.out.println("Odd Number: " + i);
			}

		}
	}

}
