package com.mygdx.game.entities.components;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.Json.Serializable;
import com.mygdx.game.entities.Rect;

public class Position extends Component implements Serializable {

	private Rect position;
	
	public Position() {
		super();
		this.setName("Position");
		this.position = new Rect();
	}
	
	public Position(Position copyPosition) {
		this.position = new Rect(copyPosition.getPosition());
	}

	public Rect getPosition() {
		return position;
	}

	public void setPosition(Rect position) {
		this.position = position;
	}
	
	public float getX() {
		return position.getX();
	}
	
	public void setX(float x) {
		this.position.setX(x);
	}
	
	public float getY() {
		return position.getY();
	}
	
	public void setY(float y) {
		this.position.setY(y);
	}
	
	public float getWidth() {
		return position.getWidth();
	}
	
	public void setWidth(float width) {
		this.position.setWidth(width);
	}
	
	public float getHeight() {
		return position.getHeight();
	}
	
	public void setHeight(float height) {
		this.position.setHeight(height);
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
