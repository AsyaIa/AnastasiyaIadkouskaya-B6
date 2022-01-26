package com.noorteck.java.hw8;

public class Day8Question3WhileLoop {

	public static void main(String[] args) {

		double sum = 0;
		double average = 0;
		int i = 20;

		while (i <= 30) {

			sum = sum + i;

			average = sum / (30 - 20);

			i++;

		}
		System.out.println("The average of numbers between 20 and 30: " + average);
	}

}
