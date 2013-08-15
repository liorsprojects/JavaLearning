package com.liorginsberg.threads;

import java.util.concurrent.locks.ReentrantLock;


public class MySystem {

	public static MySystem system = null;
	
	private MySystem() {}
	
	private ReentrantLock lock = new ReentrantLock();
	
	public static MySystem getSystem() {
		if(system == null) {
			system = new MySystem();
		}
		return system;
	}
	
	public void performSystemCheck(String checkWhat, int duration) {
		lock.lock();
		
	}
	
}
