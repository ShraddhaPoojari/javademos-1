package com.samples.designpatterns;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class SRPDemo {

	public static void main(String[] args) throws FileNotFoundException {
		String filePath = "c:\\javafsd\\out\\testout.txt";	
		
		Journal j = new Journal();
		j.addEntry("go for a run");
		j.addEntry("buy milk");
		System.out.println(j);
		
		FileSaver fs = new FileSaver();
		fs.save(j, filePath);
	}
}


class Journal {
	private List<String> entries = new ArrayList<String>();
	private int count = 0;
	public void addEntry(String text) {
		entries.add("" + (++count) + ": " + text);	
	}
	public void removeEntry(int index) {
		entries.remove(index);
	}
	public String toString() {
		return String.join(System.lineSeparator(), entries);
	}	
}

class FileSaver {
	public void save(Journal j, String filename) throws FileNotFoundException {
		PrintStream out = new PrintStream(filename);
		out.println(j.toString());
	}
}