package com.samples.designpatterns;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();
		
	}
	
}


class ShapeFactory {

	public Shape getShape(String shapeType) {
		switch (shapeType) {
			case "CIRCLE":
				return new Circle();
			case "RECTANGLE":
				return new Rectangle();
			case "SQUARE":
				return new Square();				
		}
		return null;
	}
	
	
	
}

interface Shape {
	void draw();
}

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle.draw() method..");
	}
	
}

class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square.draw() method..");
	}
	
}


class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle.draw() method..");
	}
	
}