package com.samples.javademos.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class testArraysUtils {

	public static void main(String[] args) {
		
		String[] strArray = new String[] {"Raj", "Anita", "John", "William", "max"};
		List<String> strings = Arrays.asList(strArray);
		System.out.println(strings);
		
		strings.set(0, "John");
		System.out.println("Updated Array: " + Arrays.toString(strArray));
		System.out.println("List: " + strings);
	
//		strings.add(0, "William");
//		strings.add("max");
//		strings.remove(0);
		System.out.println(strings);
		
		Arrays.sort(strArray);
		System.out.println(Arrays.toString(strArray));
		
		List<String> list = new ArrayList<String>();
		list.add("Raj");
		list.add("john");
		list.add("Max");
		
		String[] array = {"Anita"};
		Collections.addAll(list, array);
		System.out.println(list);
		
	}
	
}
