package com.liorginsberg.designpatterns.observer;

public class ObserverDemo {

	public static void main(String[] args) {
		StockGrabber stockGrabber = new StockGrabber();
		StockObserver observer1 = new StockObserver(stockGrabber);
		StockObserver observer2 = new StockObserver(stockGrabber);
		
		stockGrabber.setIbmPrice(178.2);
		stockGrabber.setApplePrice(300.2);
		
		
		
		stockGrabber.setIbmPrice(100.2);
		stockGrabber.setApplePrice(100.2);
		
		Runnable getIBM = new GetTheStock(2, "IBM", 197.00, stockGrabber);
		Runnable getApple = new GetTheStock(2, "APPLE", 677.00, stockGrabber);
		
		new Thread(getIBM).start();
		new Thread(getApple).start();
	}
}
