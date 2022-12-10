package com.mygdx.game.entities;

import java.util.ArrayList;

import com.mygdx.game.entities.components.Component;

public class Entity {

	ArrayList<Component> components;
	
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
}
