package com.noorteck.java.hw10;

public class Day10Question1 {
	public static void main(String[] args) {
		// this is my day 10 homework for q1...

		calculate(3.0, 2.0, '%');

	}

	public static void calculate(double numOne, double numTwo, char mathOperationSign) {

		if (mathOperationSign == '+') {
			System.out.println(numOne + "+" + numTwo + "=" + (numOne + numTwo));
		} else if (mathOperationSign == '-') {
			System.out.println(numOne + "-" + numTwo + "=" + (numOne - numTwo));
		} else if (mathOperationSign == '/') {
			System.out.println(numOne + "/" + numTwo + "=" + (numOne / numTwo));
		} else if (mathOperationSign == '*') {
			System.out.println(numOne + "*" + numTwo + "=" + (numOne * numTwo));
		} else if (mathOperationSign == '%') {
			System.out.println(numOne + "%" + numTwo + "=" + (numOne % numTwo));
		} else {
			System.out.println("Error message");
		}
	}
}
