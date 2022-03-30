package com.samples.javademos.oop2;

public class Fish extends Animal {

	private int gills;
	private int fins;
	private int eyes;
	
	public Fish(String name, int size, int weight, int gills, int fins, int eyes) {
		super(name, size, weight);
		this.gills = gills;
		this.fins = fins;
		this.eyes = eyes;
	}
	
	public void move(int speed) {
		swim(speed);
	}
	
	private void swim(int speed) {
		System.out.println("Fish.swim() called");
		moveMuscles();
		moveBackFin();
		super.move(speed);
	}
	
	private void moveMuscles() {
		System.out.println("Fish.moveMuscles() called");
	}
	
	private void moveBackFin() {
		System.out.println("Fish.moveBackFin() called");
	}
	
}
