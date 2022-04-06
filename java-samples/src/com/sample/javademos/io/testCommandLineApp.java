package com.sample.javademos.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class testCommandLineApp {
	
	
	public static void main(String[] args) {
		String filePath = "c:\\javafsd\\out\\testout.txt";	
		String greetingsMessage = getUserInput();
		writeGreetingsToFile(filePath, greetingsMessage);
	}

	private static void writeGreetingsToFile(String filePath, String greetingsMessage)  {
		try {
			FileWriter fw = new FileWriter(filePath, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.println (greetingsMessage);
			pw.close();
			bw.close();
			fw.close();
			System.out.println("done.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static String getUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		String message = "Greetings !! .. Hello " + name + " !! Welcome.";
		scanner.close();
		return message;
	}
	
	private static String displayMenuOptions() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Display Files");
		System.out.println("2. Add file");
		System.out.println("3. Delete file");
		System.out.println("4. Search file");
		System.out.println("5. Close Application");
		System.out.println("Enter Option ");
		String option = scanner.nextLine();
		switch (option) {
			case "1": 
				displayFiles();
				break;
			case "2":
				addFile();
				break;
		}
		scanner.close();
		return null;
	}

	private static void addFile() {
		// TODO Auto-generated method stub
		
	}

	private static void displayFiles() {
		// TODO Auto-generated method stub
		
	}
}
