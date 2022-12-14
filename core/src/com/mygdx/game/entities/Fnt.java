package com.mygdx.game.entities;

import com.badlogic.gdx.graphics.g2d.BitmapFont;

public class Fnt {

	private String name;
	private BitmapFont font;
	
	public Fnt(BitmapFont font, String name) {
		this.font = font;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BitmapFont getFont() {
		return font;
	}
	public void setFont(BitmapFont font) {
		this.font = font;
	}
	
	
}
