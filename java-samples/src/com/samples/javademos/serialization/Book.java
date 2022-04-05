package com.samples.javademos.serialization;

import java.awt.image.IndexColorModel;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
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


class TextBook extends Book {
	
	private int grade;
	
	private transient String password;
	
	public TextBook(String title, String author, int year, int grade, String password) {
		super(title, author, year);
		this.grade = grade;
		this.password = password;
	}

	@Override
	public String toString() {
		return "TextBook [grade=" + grade + ", password=" + password + "]" + super.toString();
	}

	
}

class Index implements Serializable{
	Map<String, String> indexMap;

	public Index(Map<String, String> indexMap) {
		this.indexMap = indexMap;
	}
	
}