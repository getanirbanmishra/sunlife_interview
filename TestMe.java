package com.personal.javafun;

public class TestMe {
	public static void main(String args[]) {
		PrimeCalculator pc = PrimeCalculator.getInstance();
		System.out.println(pc.nthPrime(10));

	}
}
