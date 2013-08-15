package com.liorginsberg.threads.basic;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class GetTimeThread implements Runnable {

	@Override
	public void run() {
		Date rightNow;
		Locale currentLocale;
		DateFormat dateFormatter;
		DateFormat timeFormatter;
		String dateOuput;
		String timeOutput;
		
		for (int i = 0; i < 20; i++) {
			rightNow = new Date();
			currentLocale = new Locale("en");
			dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale);
			timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
			
			dateOuput = dateFormatter.format(rightNow);
			timeOutput = timeFormatter.format(rightNow);
			
			System.out.println(dateOuput);
			System.out.println(timeOutput);
			System.out.println("\n");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
}