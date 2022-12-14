package com.mygdx.game.entities.components;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.Json.Serializable;
import com.badlogic.gdx.utils.JsonValue;
import com.mygdx.game.entities.Entity;

public class Component implements Serializable {

	private Entity owner;
	private String name;
	
	public Component() {
		
	}
	
	public Component(Entity owner) {
		this.owner = owner;
	}
	
	public void render() {
		
	}
	
	public void update() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Entity getOwner() {
		return owner;
	}

	public void setOwner(Entity owner) {
		this.owner = owner;
	}

	@Override
	public void write(Json json) {
		
	}

	@Override
	public void read(Json json, JsonValue jsonData) {
		
	}
	
}
