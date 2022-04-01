package com.samples.javademos.setDemo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class testHashSetDemo {

	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<>();
		set1.add("a");
		set1.add("b");
		set1.add("a");
		System.out.println(set1);
		
		Set<Book> books = new HashSet<Book>();
		Book book1 = new Book("RK Narayan", "Malgudi days", 1942);
		Book book2 = new Book("RK Narayan", "Malgudi days", 1942);
		
		books.add(book1);
		books.add(book2);
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());
		System.out.println(books);
				
		
	}
}

class Book {
	private String title;
	private String author;
	private int year;
	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year + "]";
	}
//	public int hashCode() {
//		return title.hashCode();
//	}
//	public boolean equals(Object obj) {
//		return this.title.equalsIgnoreCase(((Book)obj).getTitle());
//	}
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
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(title, other.title) && year == other.year;
	}
	
	
}