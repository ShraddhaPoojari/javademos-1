package com.samples.javademos.arrays;

public class testArrays {

	public static void main(String[] args) {
		
		int[] myArray = new int[10];
		
		myArray[4] = 10;
		
//		System.out.println(myArray[0]);
//		System.out.println(myArray[1]);
//		System.out.println(myArray[2]);
//		System.out.println(myArray[3]);
//		System.out.println(myArray[4]);
		
		for (int i=0; i<9; i++) {
			System.out.println(myArray[i]);
		}
		System.out.println("====================================");
		int[] array1 = {11, 12, 13, 8, 7, 9, 4};
		System.out.println(array1.length);
		System.out.println("====================================");
		
		for (int i=0; i<array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		System.out.println("====================================");
		
		System.out.println(myArray[9]);
		
	}
}
