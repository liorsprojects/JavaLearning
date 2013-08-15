package com.liorginsberg.designpatterns.factory;

import java.util.Random;

public class EnemyShipTesting {

	private static final String options = "URB";

	public static void main(String[] args) throws Exception {

		Random rand = new Random();

		for (int i = 0; i < 20; i++) {
			char option = options.charAt(rand.nextInt(options.length()));
			EnemyShip enemyShip = EnemyShipFactory.makeEnemyShip(option);
			activateEnemyShip(enemyShip);
		}

		
	}

	private static void activateEnemyShip(EnemyShip enemyShip) {
		enemyShip.displayEnemyShip();
		enemyShip.followHeroShip();
		enemyShip.enemyShoots();
	}
}
