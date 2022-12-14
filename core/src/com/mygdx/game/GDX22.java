package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.entities.components.RenderComponent;
import com.mygdx.game.managers.AudioManager;
import com.mygdx.game.managers.GameManager;
import com.mygdx.game.managers.MenuManager;
import com.mygdx.game.managers.RenderManager;

public class GDX22 extends ApplicationAdapter {
	public GameManager gameManager;
	public AudioManager audioManager;
	public MenuManager menuManager;
	public RenderManager renderManager;
	
	@Override
	public void create () {
		renderManager = new RenderManager();
		gameManager = new GameManager();
		audioManager = new AudioManager();
		menuManager = new MenuManager();
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);
		renderManager.getBatch().begin();
		
			if (gameManager.getInstance() != null) gameManager.getInstance().render();
			if (menuManager.getCurrentMenu() != null) menuManager.getCurrentMenu().render();
		
		renderManager.getBatch().end();
		
		if (gameManager.getInstance() != null) gameManager.getInstance().update();
		if (menuManager.getCurrentMenu() != null) menuManager.getCurrentMenu().update();
	}
	
	@Override
	public void dispose () {
		renderManager.getBatch().dispose();
	}
}
