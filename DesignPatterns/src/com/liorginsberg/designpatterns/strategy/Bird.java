package com.liorginsberg.designpatterns.strategy;

public class Bird extends Animal {
	
	public Bird() {
		super(); 
		setSound("Tweet");
		flyingType = new ItFlys();
	}
}
