package com.samples.javademos.oop;

import com.samples.javademos.oop2.Animal;

public class demo01classes {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		System.out.println(emp);
		
		Car.someProperty = "xyz";
		
		Car.printSomething();
		
		Car hondaCity = new Car();
		hondaCity.setColour("White");
		hondaCity.setFuelType("Petrol");
		hondaCity.setGearType("Automatic");
		hondaCity.setNoofWheels(5);
		System.out.println("The colour of the car: " + hondaCity);
		System.out.println(hondaCity.someProperty);
		
		Car marutiSwift = new Car();
		marutiSwift.setColour("White");
		marutiSwift.setFuelType("Petrol");
		marutiSwift.setGearType("Automatic");
		marutiSwift.setNoofWheels(5);
		System.out.println(marutiSwift);
		System.out.println(marutiSwift.someProperty);
	}
}
