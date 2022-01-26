package com.noorteck.java.hw8;

public class Day8Question2 {

	public static void main(String[] args) {

		for (int i = 20; i <= 200; i++) {
			if (i >= 74 && i <= 95) {
				System.out.println("Wind speed: " + i);
				System.out.println("Hurrricane's category:1");

			} else if (i >= 105 && i <= 110) {
				System.out.println("Wind speed: " + i);
				System.out.println("Huricane's category:2");

			} else if (i >= 120 && i <= 130) {
				System.out.println("Wind speed: " + i);
				System.out.println(("Huriccane's category:3"));

			} else if (i >= 140 && i <= 155) {
				System.out.println("Wind speed: " + i);
				System.out.println("Hurricane's category:4");

			} else if (i >= 165 && i <= 195) {
				System.out.println("Wind speed: " + i);
				System.out.println("Hurricane's category:5");
			} else {

			}

		}

	}

}
