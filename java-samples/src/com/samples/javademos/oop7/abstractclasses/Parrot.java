package com.samples.javademos.oop7.abstractclasses;

public class Parrot extends Bird{

	public Parrot(String name) {
		super(name);
	}

	@Override
	public void fly() {
		System.out.println(getName() + " is flying");
	}

}
