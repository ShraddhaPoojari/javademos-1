package com.samples.javademos.oop6.interfaces;

public class DeskPhone implements ITelephone {

	@Override
	public void powerOn() {
		System.out.println("No action. Always on.");
		
	}

	@Override
	public void dial(int phoneNumber) {
		System.out.println("Now ringing " + phoneNumber + " on deskphone");
	}

	@Override
	public void answer() {
		System.out.println("Answering the phone");
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		System.out.println("Calling phone Number");
		return false;
	}

	@Override
	public boolean isRinging() {
		return false;
	} 

}
