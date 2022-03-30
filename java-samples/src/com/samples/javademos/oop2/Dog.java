package com.samples.javademos.oop2;

public class Dog extends Animal {

	private int eyes;
	private int legs;
	private int tail;
	
	public Dog(String name, int size, int weight, int eyes, int legs, int tail) {
		super(name, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.foodType = "x";
	}
	
	private void moveLegs(int speed) {
		System.out.println("Dog.moveLegs() called");
	}
	

	public void move(int speed) {
		System.out.println("Dog.move() called");
		moveLegs(speed);
		super.move(speed);
	}
	
	public void eat() {
		System.out.println("Dog.eat() called");
		chew();
		super.eat();
	}
	
	public void walk() {
		System.out.println("Dog.walk() called");
		move(5);
	}
	
	public void run() {
		System.out.println("Dog.run() called");
		move(10);
	}
	
	private void chew() {
		System.out.println("Dog.chew() called");
	}
	
}
