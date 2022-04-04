package com.samples.javademos.setDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class testLinkedHashSet {

	// Both HashSet and LinkedHashSet provides uniqueness
	
	// insertion order
	
	public static void main(String[] args) {
		
		Set<String> myhashSet = new HashSet<String>();
		myhashSet.add("John");
		myhashSet.add("Alex");
		myhashSet.add("Max");
		myhashSet.add("Tracy");
		myhashSet.add("Tracy");
		System.out.println(myhashSet);
		
		Set<String> myhashSet2 = new LinkedHashSet<String>();
		myhashSet2.add("John");
		myhashSet2.add("Alex");
		myhashSet2.add("Max");
		myhashSet2.add("Tracy");
		System.out.println(myhashSet2);
		
	}
}
