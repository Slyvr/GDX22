package com.mygdx.game.managers;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class RenderManager extends Manager{

	private static SpriteBatch batch;

	public static SpriteBatch getBatch() {
		return batch;
	}

	public static void setBatch(SpriteBatch batch) {
		RenderManager.batch = batch;
	}
}
