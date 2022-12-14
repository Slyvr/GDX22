package com.mygdx.game.menus;

import java.util.ArrayList;

import com.mygdx.game.entities.Entity;

public class Menu extends Entity{

	private String name;
	private int id;
	private String type;
	private ArrayList<Entity> entities;
	private ArrayList<Menu> subMenus;
	private Menu currentSubMenu;
	private int controllerAxisTimer;
	
	public void render(){
		for(Entity e : entities){
			e.render();
		}
	}
	
	public void update() {
		for(Entity e : entities) {
			e.update();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ArrayList<Entity> getEntities() {
		return entities;
	}

	public void setEntities(ArrayList<Entity> entities) {
		this.entities = entities;
	}

	public ArrayList<Menu> getSubMenus() {
		return subMenus;
	}

	public void setSubMenus(ArrayList<Menu> subMenus) {
		this.subMenus = subMenus;
	}

	public Menu getCurrentSubMenu() {
		return currentSubMenu;
	}

	public void setCurrentSubMenu(Menu currentSubMenu) {
		this.currentSubMenu = currentSubMenu;
	}

	public int getControllerAxisTimer() {
		return controllerAxisTimer;
	}

	public void setControllerAxisTimer(int controllerAxisTimer) {
		this.controllerAxisTimer = controllerAxisTimer;
	}
	
}
