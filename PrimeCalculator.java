package com.personal.javafun;

public class PrimeCalculator {
	private static PrimeCalculator instance;
	
	private PrimeCalculator(){
		
	}
	
	public static PrimeCalculator getInstance() {
		if(instance == null) {
			instance = new PrimeCalculator();
		}
		return instance;
	}
	
	public long nthPrime(long n) {
		long primecount=0, counter = 1;
		while(primecount != n) {
			if(isPrimeNumber(++counter)) {
		        primecount++;		        
		    }
		}
		return counter;
	}
	
	private boolean isPrimeNumber(long n) {
	    if(n < 2) {
	        return false;
	    }

	    for (long i = 2; i * i <= n; i++) {
	        if (n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}	
}
