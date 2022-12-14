package com.mygdx.game.entities.components;

import com.mygdx.game.entities.Rect;
import com.mygdx.game.game.SantaGameInstance;
import com.mygdx.game.managers.GameManager;

public class GrindButton extends ButtonCollider{

	public GrindButton(Position entityPosition, Rect collisionBox, Rect scale) {
		super(entityPosition, collisionBox, scale);
	}
	
	public void action() {
		System.out.println("grind");
		SantaGameInstance game = (SantaGameInstance) GameManager.getInstance();
		game.setTimeGrindWasPushed(System.currentTimeMillis());
	}

}
