package com.samples.javademos.oop3;

public class BoxCase implements IFlyable, IMaintainable{

	private String model;
	private String manufacturer;
	private String powerSupply;
	
	public BoxCase(String model, String manufacturer, String powerSupply) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
	}
	
	public BoxCase() {
		this(null, null, null);
	}

	public void pressPowerButton() {
		System.out.println("Power Button Pressed");
	}

	@Override
	public void fly() {
		System.out.println("Boxcase is flying....");
	}

	@Override
	public boolean isUnderWarranty() {
		return true;
	}

	@Override
	public void resetDevice() {
		System.out.println("Device resetted..");
	}

}
