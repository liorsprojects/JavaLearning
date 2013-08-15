package com.liorginsberg.designpatterns.strategy;

public class Animal {
	
	private String name;
	private String favFood;
	private String sound;
	private double height;
	private int weight;
	
	public Flys flyingType;
	
	public String tryToFly() {
		return flyingType.fly();
	}
	
	public void setFlyingAbility(Flys flysType) {
		this.flyingType = flysType;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFavFood() {
		return favFood;
	}
	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	private int speed;
	

}
