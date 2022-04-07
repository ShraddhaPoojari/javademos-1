package com.samples.javademos.concurrency;

import java.util.concurrent.atomic.AtomicLong;

public class L04AtomicVariablesDemo {

	public static void main(String[] args) {
		
		IDGenerator idgen = new IDGenerator();
		System.out.println(idgen.getNewId());
		System.out.println(idgen.getNewId());
		System.out.println(idgen.getNewId());
		System.out.println(idgen.getNewId());
		System.out.println(idgen.getNewId());
		System.out.println(idgen.getNewId());
		System.out.println(idgen.getNewId());
		
	}
	
}

class IDGenerator {
	private AtomicLong id;
	
	long getNewId() {
		return id.incrementAndGet();    // id = id + 1; 
						// read id
						// increment id
						// write id
	}
}
