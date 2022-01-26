package com.noorteck.java.hw8;

public class Day8Question3DoLoop {
	public static void main(String[] args) {

		double sum = 0;
		double average = 0;
		int i = 20;

		do {

			sum = sum + i;

			average = sum / (30 - 20);

			i++;

		} while (i <= 30);

		System.out.println("The average of numbers between 20 and 30: " + average);
	}

}
