package com.mygdx.game.entities.components;

import com.mygdx.game.entities.Rect;
import com.mygdx.game.game.SantaGameInstance;
import com.mygdx.game.managers.GameManager;

public class PlayMenuButton extends MenuButtonCollider {

	public PlayMenuButton(Position entityPosition, Rect collisionBox, Rect scale) {
		super(entityPosition, collisionBox, scale);
	}
	
	public void action() {
		switchToMenu();
		GameManager.setInstance(new SantaGameInstance());
	}

}
