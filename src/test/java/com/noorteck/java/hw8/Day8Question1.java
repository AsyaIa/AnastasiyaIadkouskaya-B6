package com.noorteck.java.hw8;

public class Day8Question1 {

	public static void main(String[] args) {

		for (int i = 1; i <= 36; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("CozaLoza");

			} else if (i % 5 == 0) {
				System.out.println("Loza");

			} else if (i % 7 == 0) {
				System.out.println("Woza");

			} else if (i % 3 == 0) {
				System.out.println("Coza");

			} else {
				System.out.println(i);
			}
		}

	}

}
