package com.samples.javademos.demo1;

public class demo11forloop {

	public static void main(String[] args) {
		
		// find all prime numbers between 10 and 40
		// find how many prime numbers are there in the above range
		
		int primeCount = 0;
		for (int i=10; i<=40; i++) {
			if (isPrime(i)) {
				primeCount++;
				System.out.println(i);
			}
			if (primeCount == 4) break;
		}
		System.out.println("Total no of prime numbers: " + primeCount);
	}
	
	public static boolean isPrime(int n) {
		
		if (n==1) {
			return false;
		}
		
		for (int i=2; i<= n/2; i++) {
			if (n % i == 0)
				return false;
		}
		
		return true;
		
	}
}
