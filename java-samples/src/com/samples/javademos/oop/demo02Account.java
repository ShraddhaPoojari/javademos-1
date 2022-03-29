package com.samples.javademos.oop;

public class demo02Account {

	public static void main(String[] args) {
		Account myaccount = new Account("123456", 287.55, "John", "john@example.com", "12345");
		System.out.println(myaccount.getCustomerName());
		System.out.println(myaccount.getBalance());
		
		Account willsaccount = new Account("123590", 287.55, "Wilson", "will@example.com", "12345");
		System.out.println(willsaccount.getCustomerName());
		System.out.println(willsaccount.getBalance());
		
		Account johnsAccount = new Account("1233444", "John");
		System.out.println(johnsAccount);
		
		Account.CustomerAddress caddress = myaccount.new CustomerAddress();
		
	}
	
}
