package com.sample.javademos.io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class testBufferredStream {
	
	private static final String filePath = "c:\\javafsd\\out\\testout.txt";

	public static void main(String[] args) {
		testBufferedOutput();
	}

	private static void testBufferedOutput() {
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			String s = "Testing Buffered Output";
			byte[] b = s.getBytes();
			bos.write(b);
			bos.flush();
			bos.close();
			fos.close();
			System.out.println("End.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
