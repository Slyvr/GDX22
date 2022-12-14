package com.mygdx.game.menus;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.mygdx.game.entities.Entity;
import com.mygdx.game.entities.components.Render;
import com.mygdx.game.entities.components.Text;
import com.mygdx.game.managers.MenuManager;
import com.mygdx.game.managers.RenderManager;

public class EndGameMenu extends Menu{

	private long timeEnd;
	private long timeLength;
	
	public EndGameMenu() {
		this.timeLength = 2000;
		this.setName("EndGameMenu");
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
	
	public void load() {
		ArrayList<Entity> entities = new ArrayList<Entity>();
		Entity bg = new Entity();
		bg.setName("bg");
		bg.addComponent(new Render(RenderManager.getRenderByName("BG")));
		entities.add(bg);
		
		Entity title = new Entity();
		title.setName("title");
		Text titleText = new Text();
			titleText.setFontName("Berlin32");
			titleText.setName("titleText");
			titleText.setText("Thanks for Playing!");
			titleText.getPosition().setX(100);
			titleText.getPosition().setY(Gdx.graphics.getHeight()/1.5f);
			titleText.setColor("RED");
			titleText.setOwner(title);
		title.addComponent(titleText);
		entities.add(title);
		
		Entity credits = MenuManager.getMenuByName("MainMenu").getEntityByName("credits");
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
