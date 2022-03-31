package com.samples.javademos.arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] arr1 = {1,5,3,7,11,9,15};
		System.out.println(Arrays.toString(arr1));
				
		reverseArray(arr1);
		System.out.println(Arrays.toString(arr1));
		
//        for(int i=6;i>=0;i--) {
//            System.out.println(arr1[i]);
//        }
		
		// print the reverse of the above array.
		
	}

	private static void reverseArray(int[] array) {
		int maxIndex = array.length - 1;
		int halfLength = array.length / 2;
		for (int i=0; i<halfLength; i++) {
			int temp = array[i];
			array[i] = array[maxIndex-i];
			array[maxIndex-i] = temp;
		}		
	}
	
}
