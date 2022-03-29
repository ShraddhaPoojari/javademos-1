package com.samples.javademos.demo1;

public class Demo1Helloworld {

	public static void main(String[] args) {
		int x = 10;
//		System.out.println(rk);		
		x = 25;
		
		// byte, short, int, log
		// boolean, 
		// char, String
		// float, double
		
		int num1 = 6;
		int num2 = 5;
		System.out.println(num1 + num2);
		System.out.println("Total is " + num1 + num2); // "Total is " + "6" + "5"
		
		byte xbyte = 10;
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		byte ybyte = 124;
		
		short xshort = 20;
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		int intx = xbyte; 		// implicit casting
		System.out.println(intx);
		
		int inty = 20;
		byte by = (byte) inty; //explicit casting
		System.out.println(by); 
		
		inty = 200;		
		by = (byte) inty;
		System.out.println(by);
		
		long long1 = 100L;
	}
	
}
