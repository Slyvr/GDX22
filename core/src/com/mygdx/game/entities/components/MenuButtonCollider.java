package com.mygdx.game.entities.components;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.Json.Serializable;
import com.mygdx.game.entities.Rect;
import com.mygdx.game.managers.MenuManager;
import com.mygdx.game.menus.Menu;

public class MenuButtonCollider extends ButtonCollider implements Serializable {

	public MenuButtonCollider(Position entityPosition, Rect collisionBox, Rect scale) {
		super(entityPosition, collisionBox, scale);
		this.setName("MenuButtonCollider");
	}

	private Menu destinationMenu;
	
	public void action() {
		switchToMenu();
	}
	
	public void switchToMenu() {
		destinationMenu.reset();
		MenuManager.setCurrentMenu(destinationMenu);
	}

	public Menu getDestinationMenu() {
		return destinationMenu;
	}

	public void setDestinationMenu(Menu destinationMenu) {
		this.destinationMenu = destinationMenu;
	}
	
	@Override
	public void write(Json json) {
		super.write(json);
	}

	@Override
	public void read(Json json, JsonValue jsonData) {
		super.read(json, jsonData);
	}
}
