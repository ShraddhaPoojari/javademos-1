package com.samples.javademos.oop;

public class demo01classes {

	public static void main(String[] args) {
		Car hondaCity = new Car();
		hondaCity.setColour("White");
		hondaCity.setFuelType("Petrol");
		hondaCity.setGearType("Automatic");
		hondaCity.setNoofWheels(5);
		System.out.println("The colour of the car: " + hondaCity);
		
		Car marutiSwift = new Car();
		marutiSwift.setColour("White");
		marutiSwift.setFuelType("Petrol");
		marutiSwift.setGearType("Automatic");
		marutiSwift.setNoofWheels(5);
		System.out.println(marutiSwift);
	}
}
