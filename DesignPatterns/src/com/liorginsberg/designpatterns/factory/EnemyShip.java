package com.liorginsberg.designpatterns.factory;

public abstract class EnemyShip {
	
	private String name;
	private double damage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDamage() {
		return damage;
	}
	public void setDamage(double damage) {
		this.damage = damage;
	}
	
	public void followHeroShip() {
		System.out.println(name + " is following the hero");
	}
	public void displayEnemyShip() {
		System.out.println(name + " its on the screen");
	}
	public void enemyShoots() {
		System.out.println(name + " attaks and does " + damage );
	}
	
	
}
