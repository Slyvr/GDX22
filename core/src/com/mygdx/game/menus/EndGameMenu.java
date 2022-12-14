package com.mygdx.game.menus;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.mygdx.game.entities.Entity;
import com.mygdx.game.entities.components.MenuButtonComponent;
import com.mygdx.game.entities.components.RenderComponent;
import com.mygdx.game.entities.components.TextComponent;
import com.mygdx.game.managers.RenderManager;

public class EndGameMenu extends Menu{

	private long timeEnd;
	private long timeLength;
	
	public EndGameMenu() {
		this.timeLength = 2000;
		this.setName("EndGameMenu");
		load();
		timeEnd = System.currentTimeMillis()+timeLength;
	}
	
	public void update() {
		if (System.currentTimeMillis()>=timeEnd) {
			Gdx.app.exit();
		}
	}
	
	public void reset() {
		this.timeEnd = System.currentTimeMillis()+timeLength;
	}
	
	private void load() {
		ArrayList<Entity> entities = new ArrayList<Entity>();
		Entity bg = new Entity();
		bg.setName("bg");
		bg.addComponent(new RenderComponent(RenderManager.getRenderByName("BG")));
		entities.add(bg);
		
		Entity title = new Entity();
		title.setName("title");
		TextComponent titleText = new TextComponent();
			titleText.setFontName("Berlin32");
			titleText.setName("titleText");
			titleText.setText("Thanks for Playing!");
			titleText.getPosition().setX(100);
			titleText.getPosition().setY(Gdx.graphics.getHeight()/1.5f);
			titleText.setColor("RED");
			titleText.setOwner(title);
		title.addComponent(titleText);
		entities.add(title);
		
		Entity credits = new Entity();
		credits.setName("credits");
		TextComponent creditText = new TextComponent();
			creditText.setFontName("Arial14");
			creditText.setName("creditText");
			creditText.setText("Created by Matthew Schrum\n"
					+ "Art by: \n"
					+ " someone");
			creditText.getPosition().setX(100);
			creditText.getPosition().setY(100);
			creditText.setColor("WHITE");
			creditText.setOwner(credits);
		credits.addComponent(creditText);
		entities.add(credits);
		
		this.setEntities(entities);
	}

	public float getTimeEnd() {
		return timeEnd;
	}

	public void setTimeEnd(long timeEnd) {
		this.timeEnd = timeEnd;
	}
}
