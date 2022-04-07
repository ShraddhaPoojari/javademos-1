package com.samples.javademos.concurrency;

public class L03RaceConditionDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + ": Main thread started..");
		
		BankAccount bankAccount = new BankAccount();
		
		Thread max = new Thread(bankAccount);
		max.setName("Max");
		
		Thread anna = new Thread(bankAccount);
		anna.setName("Anna");
		
		max.start();
		anna.start();
		
		System.out.println(Thread.currentThread().getName() + ": Main thread ended...");
	}
	
}


class BankAccount implements Runnable{
	
	private int balance;
	public BankAccount() {
		this.balance = 100;
	}
	
	public synchronized void withdrawMoney(int amount) {
		System.out.println(Thread.currentThread().getName() + ": Want to withdraw: " + amount);
		if (balance >= amount) {
			System.out.println(Thread.currentThread().getName() + ": About to withdraw: " + amount);
			balance -= amount;
			System.out.println(Thread.currentThread().getName() + ": Amount withdrawn: " + amount + ". Balance = " + this.balance);
			if (this.balance < 0) {
				System.out.println(Thread.currentThread().getName() + ": Money overdrawn");
			}
		} else {
			System.out.println(Thread.currentThread().getName() + ": Sorry, not enough balance. Balance = " + this.balance);
		}
	}

	@Override
	public void run() {
		withdrawMoney(75);
		
	}
}