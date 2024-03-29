package com.liorginsberg.threads;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import javax.swing.text.rtf.RTFEditorKit;

public class CyclicBarrierDemo {
	
	private static char matrix[][] = {
		{'h', 'i'},
		{'a', 'b', 'b', 'a'},
		{'m', 'a', 'm', 'a'},
		{'j','a','v','a','f','x'},
		{'i','s','r','e','a','l'} };
	
	private static String[] results = new String[matrix.length];
	
	public static void main(String[] args) {
		Runnable merger = new Runnable() {

			@Override
			public void run() {
				String str = "";
				for (int i = 0; i < matrix.length; i++) {
					str += "\n" + results[i];
				}
				System.out.println("Result is: " + str);
			}
		};
		
		CyclicBarrier barrier = new CyclicBarrier(matrix.length, merger);
		for (int i = 0; i < matrix.length; i++) {
			new StringCreator(i, barrier).start();
		}
		System.out.println("Waiting...");
	}
	
	
	
	static class StringCreator extends Thread {
		
		int row;
		CyclicBarrier barrier;
		
		StringCreator(int row, CyclicBarrier barrier) {
			this.row = row;
			this.barrier = barrier;
		}
		
		public void run() {
			int columns = matrix[row].length;
			String str = "";
			for(int i=0; i<columns; i++) {
				try {
				Random rand = new Random();
				Thread.sleep(rand.nextInt(5000));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				str += matrix[row][i];
			}
			results[row] = str;
			System.out.println("Result for row " + row + " is : " + str);
			try {
				barrier.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
}
