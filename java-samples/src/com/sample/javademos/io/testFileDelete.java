package com.sample.javademos.io;

import java.io.File;

public class testFileDelete {
	
	public static void main(String[] args) {
		String filePath = "c:\\javafsd\\out\\testout.txt";
		
		File f = new File(filePath);
		System.out.println("File exists: " + f.exists());
		
		if (f.delete()) {
			System.out.println("File deleted succesfully");
		} else {
			System.out.println("file not deleted");
		}
	}

}
