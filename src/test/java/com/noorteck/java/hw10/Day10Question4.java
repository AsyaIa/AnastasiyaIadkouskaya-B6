package com.noorteck.java.hw10;

public class Day10Question4 {
	public static void main(String[] args) {
		// this is my day 10 homework for q4
		getDoWhileLoopResult(1, 10);

	}

	public static void getDoWhileLoopResult(int minNum, int maxNum) {

		do {

			System.out.println(minNum);

			minNum++;

		} while (minNum <= maxNum);
	}

}
