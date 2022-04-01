package com.samples.javademos.oop3;

public class MotherBoard implements IFlyable{
	
	private String model;
	private String manufacturer;
	private int ramSlots;
	private int cardSlots;
	private String bios;
	public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}
	public MotherBoard() {
		this(null, null, 0, 0, null);
	}
	public void loadProgram(String programName) {
		System.out.println("Program " + programName + " is now loading...");
	}
	@Override
	public void fly() {
		System.out.println("Motherboard flies..");
	}

}
