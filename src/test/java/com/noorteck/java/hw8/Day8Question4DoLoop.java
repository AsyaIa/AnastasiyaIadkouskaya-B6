package com.noorteck.java.hw8;

public class Day8Question4DoLoop {

	public static void main(String[] args) {

		int evenTotal = 0;

		int oddTotal = 0;

		int i = 1;

		do {

			if (i % 2 == 0) {
				evenTotal = evenTotal + i;
			} else {
				oddTotal = oddTotal + i;
			}

			i++;
		} while (i <= 20);

		System.out.println("Even Total: " + evenTotal);
		System.out.println("Odd Total: " + oddTotal);
	}

}
