package com.liorginsberg.threads;

import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

public class PreformSystemCheck implements Runnable {

	private String checkWhat;
	private int durationInSeconds; 
	
	private ReentrantLock lock = new ReentrantLock();
	
	public PreformSystemCheck(String checkWhat, int durationInSeconds) {
		this.checkWhat = checkWhat;
		this.durationInSeconds = durationInSeconds;
	}
	
	@Override
	public void run() {
		lock.lock();
		for (int i = 0; i < durationInSeconds; i++) {
			System.out.println(new Date() + ":    Checking: " + checkWhat + " presentage: " + i/durationInSeconds * 100);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		lock.unlock();
	}

}
