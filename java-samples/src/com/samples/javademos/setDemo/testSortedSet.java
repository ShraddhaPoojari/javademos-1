package com.samples.javademos.setDemo;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class testSortedSet {

	public static void main(String[] args) {
		NewBook book1 = new NewBook("Harry Potter", "J.K.Rowling", 1997);
		NewBook book2 = new NewBook("Harry Potter", "J.K.Rowling", 1997);
		NewBook book3 = new NewBook("Business at the speed of thought", "Bill Gates", 1999);
		NewBook book4 = new NewBook("Effective Java", "Joshua Bloch", 2008);
		NewBook book5 = new NewBook("Beauty and the Beast", "Disney", 1854);
		
		Set<NewBook> books = new TreeSet<>(); 
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		printBooks(books);
		
		System.out.println("--------------------------");
		
		Set<NewBook> booksByYear = new TreeSet<NewBook>(new NewBookPublishedYearComparator());
		booksByYear.add(book1);
		booksByYear.add(book2);
		booksByYear.add(book3);
		booksByYear.add(book4);
		booksByYear.add(book5);
		printBooks(booksByYear);
		
		
	}

	static void printBooks(Set<NewBook> books) {
		for (NewBook book : books) {
			System.out.println(book);
		}
	}
	
}


class NewBook implements Comparable<NewBook>{
	private String title;
	private String author;
	private int year;
	public NewBook(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	public int getYear() {
		return year;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, title, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NewBook other = (NewBook) obj;
		return Objects.equals(author, other.author) && Objects.equals(title, other.title) && year == other.year;
	}
	@Override
	public int compareTo(NewBook otherBook) {
		return this.title.compareTo(otherBook.title);
	}
}

class NewBookPublishedYearComparator implements Comparator<NewBook> {

	@Override
	public int compare(NewBook book1, NewBook book2) {
		return ((Integer)book1.getYear()).compareTo(book2.getYear());
	}
	
}