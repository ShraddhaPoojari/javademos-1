package com.samples.javademos.arraylist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class testLinkedList {

	public static void main(String[] args) {
		
		List<String> placesToVisit = new LinkedList<String>();
		placesToVisit.add("Kerala");
		placesToVisit.add("Australia");
		placesToVisit.add("Mumbai");
		placesToVisit.add("Mumbai");
		placesToVisit.add("Kanyakumari");
		placesToVisit.add("London");
		
		System.out.println(placesToVisit.contains("Mumbai"));
		System.out.println(placesToVisit.indexOf("Australia"));
		System.out.println(placesToVisit.contains("Delhi"));
		
		printList(placesToVisit);
		
		//printList2(placesToVisit);
		
		//printList3(placesToVisit);
	}
	
	private static void printList(List<String> mylist) {
		Iterator<String> it = mylist.iterator();
		while (it.hasNext()) {
			String element = it.next();
			if (element.equalsIgnoreCase("mumbai")) {
				System.out.println("removing mumbai..");
				it.remove();
			}
			System.out.println("Now visiting... " + element);			
		}
		System.out.println("--------------------------");
	}
	
	private static void printList2(List<String> mylist) {
		for (String s : mylist) {
			System.out.println("Now visiting... " + s);
//			if (s.equalsIgnoreCase("mumbai")) 
//				mylist.remove(s);
		}
		System.out.println("-----------------------");
		
	}
	
	private static void printList3(List<String> mylist) {
		for (Iterator it= mylist.iterator(); it.hasNext();) {
	         System.out.println(it.next());
		}
	}
	
}
