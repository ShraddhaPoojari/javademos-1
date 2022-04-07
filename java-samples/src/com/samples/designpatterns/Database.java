package com.samples.designpatterns;

public class Database {
	
	private static Database dbSingleInstance;
	
	private Database() {}
	
	public static Database getMyDBInstance() {
		if (dbSingleInstance == null) {
			dbSingleInstance = new Database();
		}
		return dbSingleInstance;
	}
	
	public void connect() {
		System.out.println("DB Connection Successfull...");
	}
}