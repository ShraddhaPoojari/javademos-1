package com.samples.javademos.hashmapdemo;

import java.util.TreeMap;

public class testTreeMap {

	public static void main(String[] args) {
		
		System.out.println("testing java compiler");
		
		TreeMap<String, Integer> map1 = new TreeMap<String, Integer>();
		map1.put("john", 25);
		map1.put("bob", 27);
		map1.put("max", 29);
		System.out.println(map1);
		
	}
	
}
