package com.mygdx.game.entities.components;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.Json.Serializable;
import com.badlogic.gdx.utils.JsonValue;
import com.mygdx.game.entities.Img;
import com.mygdx.game.managers.RenderManager;

public class Render extends Component implements Serializable{

	private String texName;
	private Position position;
	private Position origin;
	private Position scale;
	private Position src;
	private float rotation;
	private boolean flipX;
	private boolean flipY;
	private String color;
	
	public Render() {
		super();
		this.setName("Render");
		this.position = new Position();
		this.origin = new Position();
		this.scale = new Position();
		this.src = new Position();
	}
	
	public Render(String texName, float width, float height) {
		this.setTexName(texName);
		this.setName(texName);
		this.position = new Position();
		this.origin = new Position();
		this.scale = new Position();
		this.src = new Position();
		
		this.position.setWidth(width);
		this.position.setHeight(height);
		this.scale.setX(1);
		this.scale.setY(1);
		this.src.setWidth(width);
		this.src.setHeight(height);
	}
	
	public Render(Img img) {
		this(img.getName(),img.getTex().getWidth(),img.getTex().getHeight());
	}
	
	public void render() {
		RenderManager.render(this);
	}
	
	public String getTexName() {
		return texName;
	}
	
	public void setTexName(String texName) {
		this.texName = texName;
	}
	
	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Position getOrigin() {
		return origin;
	}

	public void setOrigin(Position origin) {
		this.origin = origin;
	}

	public Position getScale() {
		return scale;
	}

	public void setScale(Position scale) {
		this.scale = scale;
	}
	
	public void setScale(float scale) {
		this.scale.setX(scale);
		this.scale.setY(scale);
	}

	public Position getSrc() {
		return src;
	}

	public void setSrc(Position src) {
		this.src = src;
	}

	public float getRotation() {
		return rotation;
	}

	public void setRotation(float rotation) {
		this.rotation = rotation;
	}

	public boolean isFlipX() {
		return flipX;
	}

	public void setFlipX(boolean flipX) {
		this.flipX = flipX;
	}

	public boolean isFlipY() {
		return flipY;
	}

	public void setFlipY(boolean flipY) {
		this.flipY = flipY;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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
