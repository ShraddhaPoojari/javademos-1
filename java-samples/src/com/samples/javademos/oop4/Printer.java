package com.samples.javademos.oop4;

public class Printer {
	
	private int pagesPrinted;
	private boolean duplex;
	
	public Printer(int tonerLevel, boolean duplex) {
		this.pagesPrinted = 0;
		this.duplex = duplex;
	}
	
	public int printPages(int pages) {
		System.out.println("Printing " + pages + " number of pages");
		int pagesToPrint = pages;
		if (this.duplex) {
			pagesToPrint = (pages/2) + (pages %2);
			System.out.println("Printing in duplex mode");
		}
		this.pagesPrinted += pagesToPrint;
		return pagesToPrint;
	}
	
	public int getPagesPrinted() {
		return this.pagesPrinted;
	}
	
}
