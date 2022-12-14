package com.mygdx.game.entities;

import com.badlogic.gdx.graphics.Color;

public class Clr {

	private String name;
	private Color color;
	
	public Clr(String name, Color color) {
		this.name = name;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	
}
