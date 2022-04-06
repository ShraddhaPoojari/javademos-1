package com.samples.javademos.concurrency;

public class L02ThreadPriorityDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + ": Main thread started..");
		
		Thread t1 = new Thread(new AdCampaign());
		Thread t2 = new Thread(new PollResearch());
		
		t1.setName("AdCampaign");
		t2.setName("PollResearch");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		
		try {
			t2.join();	// main thread suspended until t2 finishes.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + ": Main thread ended...");
	}
	
}


class AdCampaign implements Runnable{
	@Override
	public void run() {
		for (int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName());
			if (i==5) {
				Thread.currentThread().yield();    // hint to scheduler that you are willing to wait
			}
		}
	}
}

class PollResearch implements Runnable {
	@Override
	public void run() {
		for (int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}