package com.samples.javademos.demo1;

public class demo4Strings {

	public static void main(String[] args) {
		
		String s1 = "hello";
		
		String s2 = s1 + " world";
		
		String s3 = "45";
		
		int myint = Integer.parseInt(s3);
		
		int x = 10;
		
		s2 = s1 + x;
		System.out.println(s2);
		
		double doubleNumber = 120.47d;
		String mystrdouble = "Hello " + doubleNumber;
		System.out.println("myString double = " + mystrdouble);
		
		try {
			function1();
		} catch (NumberFormatException nfe) {
			System.out.println("Numberformat exception ocurred.");
//			throw nfe;
		} catch (Exception ex) {
			System.out.println("Failed to read user input " + ex.getMessage());			
		}
		System.out.println(myint);
		
		
	}
	
	static void function1() {
		function2();
		
	}

	private static void function2() {
		String s4 = "45x";
		
		int myint = Integer.parseInt(s4);	
		
	}
	
}
