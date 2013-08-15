package com.liorginsberg.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo {

	public static void main(String[] args) {
		
		PrintJob[] jobs = { new PrintJob("Lior", 1),
							new PrintJob("Beni", 1),
							new PrintJob("Avi", 1),
							new PrintJob("Gali", 10),
							new PrintJob("Eli", 6),
							new PrintJob("Ran", 12),
							new PrintJob("Ori", 5) };
		
		ExecutorService pool = Executors.newFixedThreadPool(3);
		for (int i = 0; i < jobs.length; i++) {
			pool.submit(jobs[i]);
		}
	}
}
