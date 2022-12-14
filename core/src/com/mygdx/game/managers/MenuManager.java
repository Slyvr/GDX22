package com.mygdx.game.managers;

import java.util.ArrayList;

import com.mygdx.game.menus.*;

public class MenuManager extends Manager {

	public static Menu currentMenu;
	public static ArrayList<Menu> menus;

	public MenuManager() {
		load();
	}
	
	public static void load() {
		menus = new ArrayList<Menu>();
		
		menus.add(new MainMenu());
		menus.add(new EndGameMenu());
		menus.add(new GameMenu());
		
		currentMenu = menus.get(0);
		
		for(Menu m : menus) {
			m.load();
		}
	}
	
	public static Menu getMenuByName(String name) {
		for(Menu m : menus) {
			if (m.getName().equals(name)) return m;
		}
		return null;
	}
	
	public static Menu getCurrentMenu() {
		return currentMenu;
	}

	public static void setCurrentMenu(Menu currentMenu) {
		MenuManager.currentMenu = currentMenu;
	}
	
}
