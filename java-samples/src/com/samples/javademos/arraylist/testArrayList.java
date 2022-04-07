package com.samples.javademos.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.samples.designpatterns.Database;
import com.samples.designpatterns.*;
public class testArrayList {

	public static void main(String[] args) {
		
		Database mydb = Database.getMyDBInstance();
		mydb.connect();
		
		List<String> strList = new ArrayList<String>();
		strList.add("Hello");
		strList.add("world");
		strList.add("java");
		strList.add("coding");
		strList.add("is fun");
		System.out.println("strList: " + strList);
		
		int x = 10;
		Integer z = Integer.valueOf(x);	// this process of converting primitive 
										//   to wrapper, is called 'Boxing'
		Integer newvar = 11;			// Auto-Boxing
		int y = newvar.intValue();		// un-boxing
		
		
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
		
		list1.add(0, 100);
		System.out.println("list1 = " + list1);
		
		list1.set(list1.size()-1, 102);
		System.out.println("list1 = " + list1);
		
		List<Integer> newList = new ArrayList<Integer>();
		for (int i=0; i<100; i++) 
			newList.add(i);
		
	}
	
}
