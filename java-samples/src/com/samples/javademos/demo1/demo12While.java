package com.samples.javademos.demo1;

public class demo12While {

	public static void main(String[] args) {
		
		int count = 0;
		
		while (count != 5) {
			System.out.println("count value " + count);
			count++;
		}
		
		count = 6;
		do {
			System.out.println("count value is " + count);
			count++;
		} while (count <20);
		
	}
	
	
}
