package com.personal.javafun;

public class PrimeCalculator {
	private static int[] primes;
	private static int index = 1;
	private static PrimeCalculator instance;
	
	private PrimeCalculator(){
		
	}
	
	public static PrimeCalculator getInstance() {
		if(instance == null) {
			instance = new PrimeCalculator();
		}
		return instance;
	}
	
	public long nthPrime(int n) {
		primes = new int [n+2];
		primes[1] = 2;
		int primecount=0, counter = 1;
		while(primecount != n-1) {
			counter+=2;
			if(isPrimeNumber(counter)) {
		        primecount++;
		        primes[++index]=counter;
		    }
		}
		return counter;
	}
	
	private boolean isPrimeNumber(long n) {
		double sqrt = Math.sqrt(n);
	    for(int f=1; f<index && primes[f]<=sqrt; f++) {	    	
	    	if(n % primes[f] == 0) {	    		
	    		return false;    		
	    	}
	    }
	    return true;
	}
}
