package com.liorginsberg.threads;


/**
 * creating two Runnable instances and passing them to the threads  
 * as arguments and running them by start command.
 * 
 * @author owner
 *
 */

public class Demo2 {
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new RunnerRunnable());
		Thread t2 = new Thread(new RunnerRunnable());
	
		t1.start();
		t2.start();
	}	
	
}
