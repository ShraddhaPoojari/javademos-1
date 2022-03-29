package com.samples.javademos.demo1;

import java.util.Scanner;

public class demo13UserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		scanner.nextLine();
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		System.out.println("name entered: " + name) ;
		scanner.close();
	}
	
}
