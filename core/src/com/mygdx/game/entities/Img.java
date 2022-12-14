package com.mygdx.game.entities;

import com.badlogic.gdx.graphics.Texture;

public class Img {

	private String name;
	private Texture tex;
	
	public Img(Texture tex, String name) {
		this.tex = tex;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Texture getTex() {
		return tex;
	}
	public void setTex(Texture tex) {
		this.tex = tex;
	}
	
	
}
