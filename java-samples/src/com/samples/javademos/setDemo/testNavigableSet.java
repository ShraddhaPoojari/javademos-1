package com.samples.javademos.setDemo;

import java.util.NavigableSet;
import java.util.TreeSet;

public class testNavigableSet {

	public static void main(String[] args) {
		
		NavigableSet<Integer> setofints = new TreeSet<Integer>();
		setofints.add(74);
		setofints.add(23);
		setofints.add(89);
		setofints.add(5);
		System.out.println(setofints);
		
		System.out.println("What is the element, lower of 74: " + setofints.lower(74));
		System.out.println("What is the element, floor of 74: " + setofints.floor(74));
		System.out.println("What is the element, higher of 74: " + setofints.higher(74));
		System.out.println("What is the element, ceiling of 74: " + setofints.ceiling(74));
		System.out.println("---------------");
		System.out.println("What is the first element: " + setofints.first());
		System.out.println("What is the last element: " + setofints.last());
		System.out.println("---------------");
		System.out.println("Descending set: " + setofints.descendingSet());
		System.out.println("---------------");
		NavigableSet<Integer> headSet = setofints.headSet(74, true);
		System.out.println("Headset: " + headSet);
		headSet.add(6);
		System.out.println("Headset: " + headSet);
		System.out.println("Original Set: " + setofints);
	}
	
}
