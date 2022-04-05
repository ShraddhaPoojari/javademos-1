package com.sample.javademos.io;

import java.io.IOException;

public class testFileIO {

	public static void main(String[] args) throws Exception {
		
//		testStreams();
		
		try {
			test2();
		} catch (Exception ex) {
			throw ex;
//			System.out.println("Exception occurred " + ex.getMessage());
		}
		
		System.out.println("Business as usual");
	}

	private static void testStreams() {
		System.out.println("This is output stream");
		System.err.println("This is an error message");
		int x = '4';
		System.out.println(x);
		try {
			int i = System.in.read();
			System.out.println((char)i);
		} catch (IOException e) {
			System.err.println("IOException occurred while reading user input");
			e.printStackTrace();
		}
	}
	
	static void test2() throws Exception {
		throw new Exception ("This is a test exception thrown from test2 method");
	}
	
}
