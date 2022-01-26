package com.noorteck.java.hw8;

public class Day8Question4ForLoop {

	public static void main(String[] args) {

		int evenTotal = 0;

		int oddTotal = 0;

		for (int i = 1; i <= 20; i++) {

			if (i % 2 == 0) {
				evenTotal = evenTotal + i;
			} else {
				oddTotal = oddTotal + i;

			}
		}

		System.out.println("Even Total: " + evenTotal);
		System.out.println("Odd Total: " + oddTotal);
	}

}
