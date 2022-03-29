package com.samples.javademos.demo1;

public class demo5operators {

	public static void main(String[] args) {
		
		int result = 1 + 2;
		result = result * 10;	// 30
		int remainder = result % 4;	// remainder = 2
		System.out.println(remainder);
		
		result++;   // result = result + 1;
		
		result--;
		
		result += 2; // result = result + 2;
		
		result /= 3;
		
		System.out.println(result);
		
		boolean isTemp = true;
		
		if (isTemp) {
			System.out.println("Temp value");
		}
		
		int topScore = 100;
		if (topScore == 100) {
			System.out.println("high score");
		}
		
//		if (topScore = 100) {
//			System.out.println("high score");
//		}
		
		boolean myFlag = false;
		
		if (myFlag == false) {
			System.out.println("1");
		} else if (result > 10) {
			System.out.println("2");
		} else {
			System.out.println("3");
		}
		
		topScore = 100;
		int secontTopScore = 80;	
		if ( (topScore > secontTopScore) || (topScore <= 100) ) {
			System.out.println("just missed");
		}
		
		int age = 25;
//		if (age > 20) {
//			System.out.println("Can rent a car");
//		} else {
//			System.out.println("Wait for a while");
//		}
		
//		String message = (age > 20) ? "can rent a car" : "wait for a while";
		boolean isCarAvailable = false;
		String message = (age > 20) ? (isCarAvailable) ? "Can rent a car" : "wait for a while" : "wait for a while";
		System.out.println(message);
	}
	
}
