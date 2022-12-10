package com.mygdx.game.game;

import java.util.ArrayList;

import com.mygdx.game.entities.Entity;

public class Layer {

	private ArrayList<Entity> entities;
	
	public void render() {
		for(Entity e : entities) {
			e.render();
		}
	}
	
	public void update() {
		for(Entity e : entities) {
			e.update();
		}
	}

	public ArrayList<Entity> getEntities() {
		return entities;
	}

	public void setEntities(ArrayList<Entity> entities) {
		this.entities = entities;
	}
	
	
}
