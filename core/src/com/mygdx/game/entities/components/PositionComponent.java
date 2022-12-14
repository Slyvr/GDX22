package com.mygdx.game.entities.components;

import com.badlogic.gdx.math.Rectangle;

public class PositionComponent extends Component{

	private Rectangle position;
	
	public PositionComponent() {
		this.setName("PositionComponent");
		this.position = new Rectangle();
	}
	
	public PositionComponent(PositionComponent copyPosition) {
		this.position = new Rectangle(copyPosition.getPosition());
	}

	public Rectangle getPosition() {
		return position;
	}

	public void setPosition(Rectangle position) {
		this.position = position;
	}
	
	public float getX() {
		return position.x;
	}
	
	public void setX(float x) {
		this.position.x = x;
	}
	
	public float getY() {
		return position.y;
	}
	
	public void setY(float y) {
		this.position.y = y;
	}
	
	public float getWidth() {
		return position.width;
	}
	
	public void setWidth(float width) {
		this.position.width = width;
	}
	
	public float getHeight() {
		return position.height;
	}
	
	public void setHeight(float height) {
		this.position.height = height;
	}
}
