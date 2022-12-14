package com.mygdx.game.entities.components;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.Json.Serializable;
import com.badlogic.gdx.utils.JsonValue;
import com.mygdx.game.entities.Rect;

public class ButtonCollider extends Collider implements Serializable{

	private boolean mouseAction;
	
	public ButtonCollider() {
		this.setName("ButtonCollider");
	}
	
	public ButtonCollider(Position entityPosition, Rect collisionBox, Rect scale) {
		super(entityPosition, collisionBox, scale);
		this.setName("ButtonCollider");
	}
	
	public void update() {
		if (mouseAction) mouseClicked();
	}
	
	public void action() {
		
	}
	
	public void mouseClicked() {
		if (Gdx.input.justTouched()) {
			Rect mousePos = new Rect(Gdx.input.getX(),Gdx.graphics.getHeight()-Gdx.input.getY(),1,1);
			if (isCollision(mousePos)) {
				action();
			}
		}
	}

	public boolean isMouseAction() {
		return mouseAction;
	}

	public void setMouseAction(boolean mouseAction) {
		this.mouseAction = mouseAction;
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
