package com.liorginsberg.designpatterns.observer;

public class StockObserver implements Observer{
	private double ibmPrice;
	private double applePrice;
	
	private static int observerIDTracker = 0;
	private int observerID = 0;
	
	private Subject stockGrabber;
	
	
	public StockObserver(Subject stockGrabber) {
		this.stockGrabber = stockGrabber;
		this.observerID = ++observerIDTracker;
		System.out.println("New Observer " + observerID);
		stockGrabber.register(this);
	}


	@Override
	public void update(double ibmPrice, double applePrice) {
		this.ibmPrice = ibmPrice;
		this.applePrice = applePrice;
		
		printThePrices();
	}


	private void printThePrices() {
		System.out.println(observerID + "\nIBM: " + ibmPrice + "\nApple: " + applePrice);
		
	}

}
