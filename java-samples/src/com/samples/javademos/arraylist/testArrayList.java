package com.samples.javademos.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class testArrayList {

	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		strList.add("Hello");
		strList.add("world");
		strList.add("java");
		strList.add("coding");
		strList.add("is fun");
		System.out.println("strList: " + strList);
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(3);
		list1.add(null);
		System.out.println("list1 = " + list1);
		
		list1.remove(3);
		System.out.println("list1 = " + list1);
		list1.remove(3);
		System.out.println("list1 = " + list1);
		
		list1.add(3, 120);
		System.out.println("list1 = " + list1);
		
		System.out.println(list1.set(2, 30));
		System.out.println("list1 = " + list1);
		
		list1.add(345);
		System.out.println("list1 = " + list1);
		
		
	}
	
}
