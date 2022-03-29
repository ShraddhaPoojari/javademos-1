package com.samples.javademos.oop;

public class Account {

	private String number;
	private double balance;
	private String customerName;
	private String customerEmail;
	private String phoneNumber;
	private CustomerAddress cAddress;
	
	public Account(String number) {
		this.number = number;
		cAddress = new CustomerAddress();
	}

	public Account(String number, double balance, String customerName, String customerEmail, String phoneNumber) {
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.phoneNumber = phoneNumber;
	}
	
	public Account(String number, String customerName) {
		this(number, 0.00d, customerName, null, null);
	}
	
	public Account() {
		this(null, 0.00, null, null, null);
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", balance=" + balance + ", customerName=" + customerName
				+ ", customerEmail=" + customerEmail + ", phoneNumber=" + phoneNumber + "]";
		
		
	}
	
	class CustomerAddress {
		String buildingNo;
		String streetName;
		String city;
		String state;
	}

	
}
