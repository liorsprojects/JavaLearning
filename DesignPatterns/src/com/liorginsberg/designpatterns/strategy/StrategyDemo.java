package com.liorginsberg.designpatterns.strategy;

/**
 * Strategy design pattern lets you dynamically change object behavior.
 * 
 * @author owner
 *
 */
public class StrategyDemo {
	public static void main(String[] args) {
		Animal sparky = new Dog();
		Animal tweety = new Bird();
		
		System.out.println("Dog: " + sparky.tryToFly());
		System.out.println("Bird: " + tweety.tryToFly());
		
		sparky.setFlyingAbility(new ItFlys());
		
		System.out.println("Dog: " + sparky.tryToFly());
	}
}
