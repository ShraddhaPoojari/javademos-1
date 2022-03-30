package com.samples.javademos.oop3;

public class BoxCase {

	private String model;
	private String manufacturer;
	private String powerSupply;
	
	public BoxCase(String model, String manufacturer, String powerSupply) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
	}

	public void pressPowerButton() {
		System.out.println("Power Button Pressed");
	}

}
