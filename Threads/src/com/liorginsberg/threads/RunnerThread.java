package com.liorginsberg.threads;

class RunnerThread extends Thread {

	public void run() {
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("hello " + i);
		}
	}
	
}