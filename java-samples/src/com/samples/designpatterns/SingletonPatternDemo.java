package com.samples.designpatterns;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		
		Database mydb = Database.getMyDBInstance();
		mydb.connect();
		
	}
	
}

