package com.liorginsberg.designpatterns.strategy;

public class Dog extends Animal {

	public void digHole() {
		System.out.println("Digging a hole...");
	}
	
	public Dog() {
		super();
		setSound("Bark");
		flyingType = new CantFly();
	}
	
}
