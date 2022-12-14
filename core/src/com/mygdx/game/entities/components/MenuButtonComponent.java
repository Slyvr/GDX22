package com.mygdx.game.entities.components;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.mygdx.game.entities.Entity;
import com.mygdx.game.managers.MenuManager;
import com.mygdx.game.menus.Menu;

public class MenuButtonComponent extends ColliderComponent {

	private Menu destinationMenu;
	
	public MenuButtonComponent(Entity owner) {
		this.setOwner(owner);
	}
	
	public MenuButtonComponent(PositionComponent entityPosition, Rectangle collisionBox, Rectangle scale) {
		this.setEntityPosition(entityPosition);
		this.setCollisionBox(collisionBox);
		this.getCollisionBox().width = this.getCollisionBox().width*scale.x;
		this.getCollisionBox().height = this.getCollisionBox().height*scale.y;
	}

	public void update() {
		btnClicked();
	}
	
	public void btnClicked() {
		if (Gdx.input.justTouched()) {
			Rectangle mousePos = new Rectangle(Gdx.input.getX(),Gdx.graphics.getHeight()-Gdx.input.getY(),1,1);
			if (isCollision(mousePos)) {
				switchToMenu(destinationMenu);
			}
		}
	}
	
	public void switchToMenu(Menu destination) {
		destination.reset();
		MenuManager.setCurrentMenu(destination);
	}

	public Menu getDestinationMenu() {
		return destinationMenu;
	}

	public void setDestinationMenu(Menu destinationMenu) {
		this.destinationMenu = destinationMenu;
	}
	
	
}
