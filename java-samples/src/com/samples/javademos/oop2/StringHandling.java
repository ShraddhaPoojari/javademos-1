package com.samples.javademos.oop2;

public class StringHandling {

	public static void main(String[] args) {
		String s1 = new String("Hello World");  
		System.out.println(s1.length());
		System.out.println(s1.toLowerCase());
		
		String sub = new String("Welcome");
		System.out.println(sub.substring(2));
		
		String s3 = "Worldle";
		String s4 = "World";
		System.out.println(s3.compareTo(s4));		// 0  = both are same
													// <0 = s3 < s4
													// >0 = s3 > s4
		
		String s5 = "";
		System.out.println(s5.isEmpty());
		
		StringBuffer sb = new StringBuffer("Hello world");
		System.out.println(sb.toString());
		sb.append(" to ");
		sb.append(" everyone ");
		System.out.println(sb.toString());
		System.out.println(sb.charAt(6));
		sb.replace(6, 11, "Java");
		System.out.println(sb.toString());
		
		StringBuilder sb1 = new StringBuilder("Happy");
		sb1.append(" Feet ");
		System.out.println(sb1.toString());
		
	}
	
}
