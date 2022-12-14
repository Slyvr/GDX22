package com.mygdx.game.menus;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.mygdx.game.entities.Entity;
import com.mygdx.game.entities.components.ButtonComponent;
import com.mygdx.game.entities.components.ColliderComponent;
import com.mygdx.game.entities.components.RenderComponent;
import com.mygdx.game.entities.components.TextComponent;
import com.mygdx.game.managers.RenderManager;

public class MainMenu extends Menu{

	public MainMenu() {
		this.setName("MainMenu");
		load();
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
			titleText.setText("Santa's Workshop");
			titleText.getPosition().setX(100);
			titleText.getPosition().setY(Gdx.graphics.getHeight()/1.5f);
			titleText.setColor("RED");
			titleText.setOwner(title);
		title.addComponent(titleText);
		entities.add(title);
		
		Entity playButton = new Entity();
		playButton.setName("playButton");
		RenderComponent playButtonRender = new RenderComponent(RenderManager.getRenderByName("playbutton"));
			playButtonRender.getPosition().setX(100);
			playButtonRender.getPosition().setY(Gdx.graphics.getHeight()/2);
			playButtonRender.setScale(2);
			playButtonRender.setOwner(playButton);
		playButton.addComponent(playButtonRender);
		entities.add(playButton);
		
		Entity backButton = new Entity();
		backButton.setName("backButton");
		RenderComponent backButtonRender = new RenderComponent(RenderManager.getRenderByName("backbutton"));
			backButtonRender.getPosition().setX(100);
			backButtonRender.getPosition().setY(Gdx.graphics.getHeight()/2 - backButtonRender.getPosition().getHeight()*3);
			backButtonRender.setScale(2);
			backButtonRender.setOwner(backButton);
			backButton.addComponent(backButtonRender);
		ButtonComponent backButtonComponent
			= new ButtonComponent(
				backButtonRender.getPosition(),
				new Rectangle(backButtonRender.getPosition().getPosition()),
				backButtonRender.getScale().getPosition()
				);
			backButtonComponent.setOwner(backButton);
			backButton.addComponent(backButtonComponent);
		entities.add(backButton);
		
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
}
