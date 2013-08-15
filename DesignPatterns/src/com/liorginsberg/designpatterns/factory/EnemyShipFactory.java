package com.liorginsberg.designpatterns.factory;


public class EnemyShipFactory {
	
	public static EnemyShip makeEnemyShip(char option) throws Exception {
		
		EnemyShip enemyShip = null;
		
		if(option == 'U') {
			enemyShip = new UFOEnemyShip();
		} else if(option == 'R') {
			enemyShip = new RocketEnemyShip();
		} else if(option == 'B') {
			enemyShip = new BigUFOEnemyShip();
		} else {
			throw new Exception("WTF?");
		}
		return enemyShip;
	}
	
}
