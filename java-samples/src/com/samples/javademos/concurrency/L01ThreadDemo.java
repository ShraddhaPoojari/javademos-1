package com.samples.javademos.concurrency;

public class L01ThreadDemo {

	public static void main(String[] args) {
		
		Task task = new Task();
		Thread thread = new Thread(task);
		thread.setName("A1");
		thread.start();
	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		someFunctionCall();
		
		System.out.println(Thread.currentThread().getName() +  ": inside main method...");
		
	}

	private static void someFunctionCall() {
		System.out.println(Thread.currentThread().getName() +  ": Some function is called...");
	}
	
}

class Task implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() +  ": inside run method in task...");
		go();
	}
	
	private void go() {
		System.out.println(Thread.currentThread().getName() +  ": inside task.go method...");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		more();
	}
	
	private void more() {
		System.out.println(Thread.currentThread().getName() +  ": inside task.more method...");
	}
	
}