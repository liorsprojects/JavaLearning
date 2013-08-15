package com.liorginsberg.designpatterns.observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {

	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double applePrice;

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
	}

	public void setApplePrice(double applePrice) {
		this.applePrice = applePrice;
		notifyObservers();
	}

	public StockGrabber() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer observer) {
		observers.add(observer);
		System.out.println("Register Observer");
	}

	@Override
	public void unregister(Observer observer) {
		observers.remove(observer);
		System.out.println("Unregister Observer");
	}

	@Override
	public void notifyObservers() {		
		for (Observer observer : observers) {
			observer.update(ibmPrice, applePrice);
		}
		System.out.println("Update Observers");
	}

}
