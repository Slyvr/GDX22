package com.mygdx.game.entities;

import java.util.ArrayList;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.Json.Serializable;
import com.badlogic.gdx.utils.JsonValue;
import com.mygdx.game.entities.components.Component;

public class Entity implements Serializable{

	private String name;
	private ArrayList<Component> components;
	
	public Entity() {
		components = new ArrayList<Component>();
	}
	
	public Entity(Entity copy) {
		components = (ArrayList<Component>) copy.getComponents().clone();
	}
	
	public void render() {
		for(Component c : components) {
			c.render();
		}
	}
	
	public void update() {
		for(Component c : components) {
			c.update();
		}
	}
	
	public Component getComponentByName(String name) {
		for (Component c : components) {
			if (c.getName().equals(name)) return c;
		}
		return null;
	}
	
	public void addComponent(Component component) {
		components.add(component);
	}
	
	public void removeComponent(Component component) {
		components.remove(component);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Component> getComponents() {
		return components;
	}

	@Override
	public void write(Json json) {
		
	}

	@Override
	public void read(Json json, JsonValue jsonData) {
		
	}
}
