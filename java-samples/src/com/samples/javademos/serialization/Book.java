package com.samples.javademos.serialization;

import java.io.Serializable;
import java.util.Objects;

class Book implements Serializable{
	private String title;
	private String author;
	private int year;
	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year + "]";
	}
	
}
