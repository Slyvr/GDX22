package com.mygdx.game.menus;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.mygdx.game.entities.Entity;
import com.mygdx.game.entities.Rect;
import com.mygdx.game.entities.components.GrindButton;
import com.mygdx.game.entities.components.Render;
import com.mygdx.game.managers.RenderManager;

public class GameMenu extends Menu {

	public GameMenu() {
		this.setName("GameMenu");
	}
	
	public void update() {
		super.update();
	}
	
	public void reset() {
		
	}
	
	public void load() {
		ArrayList<Entity> entities = new ArrayList<Entity>();
		
		Entity grind = new Entity();
		grind.setName("grind");
		Render grindRender = new Render(RenderManager.getRenderByName("playbutton"));
			grindRender.getPosition().setX(100);
			grindRender.getPosition().setY(Gdx.graphics.getHeight()/2);
			grindRender.setScale(2);
			grindRender.setOwner(grind);
			grind.addComponent(grindRender);
		GrindButton grindButton
			= new GrindButton(
					grindRender.getPosition(),
				new Rect(grindRender.getPosition().getPosition()),
				grindRender.getScale().getPosition()
				);
			grindButton.setOwner(grind);
			grindButton.setMouseAction(true);
			grind.addComponent(grindButton);
		entities.add(grind);
		
		this.setEntities(entities);
	}
}
