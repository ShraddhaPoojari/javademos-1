package com.sample.javademos.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexdemo {

	public static void main(String[] args) {
		
		//regextest1();
		
		// regextest2();
		
//		regextest3();
		
//		regextest4();
		
		regextest5();
		
	}

	private static void regextest5() {
		System.out.println(Pattern.matches("\\d", "abc"));
		System.out.println(Pattern.matches("\\d", "1"));
	}

	private static void regextest4() {
		System.out.println(Pattern.matches("[amn]?", "a"));
		System.out.println(Pattern.matches("[amn]?", "aa"));
		System.out.println(Pattern.matches("[amn]+", "aa"));
		System.out.println(Pattern.matches("[amn]+", "aaa"));
	}

	private static void regextest3() {
		System.out.println(Pattern.matches("[amn]", "abcd"));
		System.out.println(Pattern.matches("[amn]", "a"));
		System.out.println(Pattern.matches("[amn]", "m"));
		System.out.println(Pattern.matches("[amn]", "n"));
	}

	private static void regextest2() {
		System.out.println(Pattern.matches(".s", "as"));
		System.out.println(Pattern.matches(".s", "mk"));
		System.out.println(Pattern.matches(".s", "mst"));
		System.out.println(Pattern.matches("..s", "mas"));	// true
	}

	private static void regextest1() {
		Pattern p = Pattern.compile(".s");	// single char
		Matcher m = p.matcher("aa");
		System.out.println(m.matches());
		
		System.out.println(Pattern.compile(".b").matcher("ab").matches());
		System.out.println(Pattern.compile(".b").matcher("cab").matches());
		
		System.out.println(Pattern.matches(".s", "as"));
	}
	
	
	
}
