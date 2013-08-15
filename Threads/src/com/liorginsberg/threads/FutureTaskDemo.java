package com.liorginsberg.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTaskDemo {

	public static void main(String[] args) throws InterruptedException {
		Callable<Double> myComputation = new MyComputation();
		FutureTask<Double> task = new FutureTask<Double>(myComputation);
		Thread t = new Thread(task);
		t.start();
		System.out.println("Keep doing thins in the main thread...");
		System.out.println("Keep doing thins in the main thread...");
		System.out.println("Keep doing thins in the main thread...");
		System.out.println("calling task.get()...");
		Double res = null;
		try{
			res = task.get();
		}catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		System.out.println("task.get() returns...");
		System.out.println("result = " + res);
		
		
	}
	
	
	static class MyComputation implements Callable<Double> {

		@Override
		public Double call() throws Exception {
			double[] averages = new double[40];
			for (int i = 0; i < averages.length; i++) {
				double total = 0;
				for(int j = 0; j < 3000000; j++ ) {
					total += Math.random();
				}
				averages[i] = total/3000000;
				
			}
			double sum = 0;
			for(int k=0; k<averages.length; k++) {
				sum += averages[k];
			}
			return sum / averages.length;
		}
		
	}
}
