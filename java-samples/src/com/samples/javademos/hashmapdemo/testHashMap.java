package com.samples.javademos.hashmapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class testHashMap {

	public static void main(String[] args) {
		
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("John", 25);
		map1.put("Max", 29);
		map1.put("Raj", 35);
		System.out.println(map1);
		map1.put("Max", 31);
		System.out.println(map1);
		
		System.out.println("Is john there ? " + map1.containsKey("John"));
		System.out.println("Is wilson there ? " + map1.containsKey("Wilson"));
		
		System.out.println("Raj's age: " + map1.get("Raj"));
		
		System.out.println("all keys: " + map1.keySet());
		System.out.println("all values: " + map1.values());
		
		Set<String> names = map1.keySet();
		for (String name : names)
			System.out.println("Name: " + name + ", Age: " + map1.get(name));
		
		// Map of Maps
		Map<String, Map<String, Object>> userProfiles = new HashMap<String, Map<String,Object>>();
		Map<String, Object> profile = new HashMap<String, Object>();
		profile.put("age", 25);
		profile.put("dept", "Admin");
		profile.put("city", "NY");
		userProfiles.put("John", profile);
		
		profile = new HashMap<String, Object>();
		profile.put("age", 29);
		profile.put("dept", "HR");
		profile.put("city", "Houston");
		userProfiles.put("Michael", profile);
		
		System.out.println(userProfiles);
		
		Map<String, Object> searchProfile = new HashMap<String, Object>();
		searchProfile.put("age", 29);
		searchProfile.put("dept", "HR");
		searchProfile.put("city", "Dallas");
		
		System.out.println(searchProfile);
		System.out.println(userProfiles);
		
		System.out.println(userProfiles.containsValue(searchProfile));
		
	}
	
}
