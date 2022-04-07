package com.sample.javademos.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class testFileWriter {
	
	private static final String filePath = "c:\\javafsd\\out\\testout.txt";
	
	public static void main(String[] args) {
		// testFileWriter1();
		// testFileReader();
		// testBufferedWriter();
		testPrintWriter();
		appendDataToFile();
	}

	private static void appendDataToFile() {
		try {
			FileWriter fw = new FileWriter(filePath, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.println ("Appending these lines");
			pw.close();
			bw.close();
			fw.close();
			System.out.println("done.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void testPrintWriter() {
		try {
			FileWriter fw = new FileWriter(filePath);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.println("new line printed from printwriter");
			pw.println("more lines.......");			
			pw.close();
			bw.close();
			fw.close();
			System.out.println("done.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void testBufferedWriter() {
		try {
			FileWriter fw = new FileWriter(filePath);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("sample using buffered writer");
			bw.close();
			System.out.println("done.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void testFileReader() {
		try {
			FileReader fr = new FileReader(filePath);
			int i;
			while ( (i=fr.read()) != -1 ) {
				System.out.print((char)i);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void testFileWriter1() {
		try {
			FileWriter fw = new FileWriter(filePath);
			fw.write("Hello world using fileWriter");
			fw.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
