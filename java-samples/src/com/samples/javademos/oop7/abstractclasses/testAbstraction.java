package com.samples.javademos.oop7.abstractclasses;

public class testAbstraction {

	public static void main(String[] args) {
		Animal animal = new Dog("doggy");
		animal.eat();
		animal.breathe();
		
		Bird parrot = new Parrot("Parrot");
		parrot.eat();
		parrot.fly();
	}
	
}
