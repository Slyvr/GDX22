package com.mygdx.game.entities.components;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.Json.Serializable;
import com.badlogic.gdx.utils.JsonValue;
import com.mygdx.game.entities.Rect;

public class Collider extends Component implements Serializable{

	private Rect collisionBox;
	
	private Position entityPosition;
	
	public Collider() {
		this.setName("Collider");
	}
	
	public Collider(Position entityPosition, Rect collisionBox, Rect scale) {
		this.setName("Collider");
		this.entityPosition = entityPosition;
		this.collisionBox = collisionBox;
		this.collisionBox.setWidth(collisionBox.getWidth()*scale.getX());
		this.collisionBox.setHeight(collisionBox.getHeight()*scale.getY());
	}
	
	public boolean isCollision(Rect collider) {
		collisionBox.setX(entityPosition.getX());
		collisionBox.setY(entityPosition.getY());
		if (collider.getRectangle().overlaps(collisionBox.getRectangle())) {
			return true;
		}
		return false;
	}

	public Rect getCollisionBox() {
		return collisionBox;
	}

	public void setCollisionBox(Rect collisionBox) {
		this.collisionBox = collisionBox;
	}

	public Position getEntityPosition() {
		return entityPosition;
	}

	public void setEntityPosition(Position entityPosition) {
		this.entityPosition = entityPosition;
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
