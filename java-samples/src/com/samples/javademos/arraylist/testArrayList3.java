package com.samples.javademos.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.samples.javademos.oop3.*;

public class testArrayList3 {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int inputSize = 5;
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		System.out.println("Enter " + inputSize + " integer values.\r");
		for (int i=0; i<inputSize; i++) {
			intList.add(scanner.nextInt());
		}
		
		for (Integer i : intList)
			System.out.println(i);
		
		Object[] newobjarray = intList.toArray();
		System.out.println(Arrays.toString(newobjarray));
		
//		int[] newintarray = new int[intList.size()];
//		newintarray = ((ArrayList)intList).toArray(newintarray);
		
	}
	
}
