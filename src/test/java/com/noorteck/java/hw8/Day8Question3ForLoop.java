package com.noorteck.java.hw8;

public class Day8Question3ForLoop {

	public static void main(String[] args) {

		double sum = 0;
		double average = 0;

		for (int i = 20; i <= 30; i++) {

			sum = sum + i;

			average = sum / (30 - 20);

		}
		System.out.println("The average of numbers between 20 and 30: " + average);
	}

}
