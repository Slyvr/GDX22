package com.mygdx.game.managers;

import com.mygdx.game.game.GameInstance;

public class GameManager extends Manager {

	private static GameInstance instance;

	public GameManager() {
		instance = new GameInstance();
	}
	
	public static GameInstance getInstance() {
		return instance;
	}

	public static void setInstance(GameInstance instance) {
		GameManager.instance = instance;
	}
	
	
}
