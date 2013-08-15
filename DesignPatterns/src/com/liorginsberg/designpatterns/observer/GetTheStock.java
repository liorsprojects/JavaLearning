package com.liorginsberg.designpatterns.observer;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable {

	private int startTime;
	private String stock;
	private double price;

	private Subject stockGrabber;

	public GetTheStock(int startTime, String stock, double price, StockGrabber stockGrabber) {
		this.startTime = startTime;
		this.stock = stock;
		this.price = price;
		this.stockGrabber = stockGrabber;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			try{
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			double ranNum = (Math.random() * (.06)) - .03;
			DecimalFormat df = new DecimalFormat("#.##");
			price = Double.valueOf(df.format(price + ranNum));
			if(stock.equals("IBM")) 
				((StockGrabber)stockGrabber).setIbmPrice(price);
			if(stock.equals("APPLE")) 
				((StockGrabber)stockGrabber).setApplePrice(price);
			System.out.println(stock + ": " + df.format(price + ranNum));
		}
	
	}

}
