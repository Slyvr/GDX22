package com.mygdx.game.game;

import java.util.ArrayList;

public class GameInstance {

	private ArrayList<Layer> layers;
	
	public GameInstance() {
		layers = new ArrayList<Layer>();
	}
	
	public void render() {
		for(Layer l : layers) {
			l.render();
		}
	}
	
	public void update() {
		for(Layer l : layers) {
			l.update();
		}
	}

	public ArrayList<Layer> getLayers() {
		return layers;
	}

	public void setLayers(ArrayList<Layer> layers) {
		this.layers = layers;
	}
	
}
