package com.liorginsberg.threads;

public class PrintJob implements Runnable {

	private String name;
	private int length;

	public PrintJob(String name, int length) {
		this.name = name;
		this.length = length;
	}

	@Override
	public void run() {
		System.out.println(name + " started");
		for (int i = 0; i < length; i++) {
			try {Thread.sleep(1000);} catch (Exception e) {}
		}
		System.out.println(name + " completed");
	}
}
