package com.mygdx.game.menus;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.mygdx.game.entities.Entity;
import com.mygdx.game.entities.Rect;
import com.mygdx.game.entities.components.MenuButtonCollider;
import com.mygdx.game.entities.components.PlayMenuButton;
import com.mygdx.game.entities.components.Render;
import com.mygdx.game.entities.components.Text;
import com.mygdx.game.managers.MenuManager;
import com.mygdx.game.managers.RenderManager;

public class MainMenu extends Menu{

	public MainMenu() {
		this.setName("MainMenu");
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
			titleText.setText("Santa's Workshop");
			titleText.getPosition().setX(100);
			titleText.getPosition().setY(Gdx.graphics.getHeight()/1.5f);
			titleText.setColor("RED");
			titleText.setOwner(title);
		title.addComponent(titleText);
		entities.add(title);
		
		Entity playButton = new Entity();
		playButton.setName("playButton");
		Render playButtonRender = new Render(RenderManager.getRenderByName("playbutton"));
			playButtonRender.getPosition().setX(100);
			playButtonRender.getPosition().setY(Gdx.graphics.getHeight()/2);
			playButtonRender.setScale(2);
			playButtonRender.setOwner(playButton);
			playButton.addComponent(playButtonRender);
		PlayMenuButton playButtonComponent
			= new PlayMenuButton(
					playButtonRender.getPosition(),
				new Rect(playButtonRender.getPosition().getPosition()),
				playButtonRender.getScale().getPosition()
				);
			playButtonComponent.setOwner(playButton);
			playButtonComponent.setDestinationMenu(MenuManager.getMenuByName("GameMenu"));
			playButtonComponent.setMouseAction(true);
			playButton.addComponent(playButtonComponent);
		entities.add(playButton);
		
		Entity backButton = new Entity();
		backButton.setName("backButton");
		Render backButtonRender = new Render(RenderManager.getRenderByName("backbutton"));
			backButtonRender.getPosition().setX(100);
			backButtonRender.getPosition().setY(Gdx.graphics.getHeight()/2 - backButtonRender.getPosition().getHeight()*3);
			backButtonRender.setScale(2);
			backButtonRender.setOwner(backButton);
			backButton.addComponent(backButtonRender);
		MenuButtonCollider backButtonComponent
			= new MenuButtonCollider(
				backButtonRender.getPosition(),
				new Rect(backButtonRender.getPosition().getPosition()),
				backButtonRender.getScale().getPosition()
				);
			backButtonComponent.setOwner(backButton);
			backButtonComponent.setDestinationMenu(MenuManager.getMenuByName("EndGameMenu"));
			backButtonComponent.setMouseAction(true);
			backButton.addComponent(backButtonComponent);
		entities.add(backButton);
		
		Entity credits = new Entity();
		credits.setName("credits");
		Text creditText = new Text();
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
