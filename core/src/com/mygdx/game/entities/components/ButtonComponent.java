package com.mygdx.game.entities.components;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.mygdx.game.entities.Entity;

public class ButtonComponent extends ColliderComponent {

	public ButtonComponent(Entity owner) {
		this.setOwner(owner);
	}
	
	public ButtonComponent(PositionComponent entityPosition, Rectangle collisionBox, Rectangle scale) {
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
				System.out.println("CLICKED "+this.getOwner().getName());
			}
		}
	}
}
